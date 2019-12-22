package com.hyperskilldev.universalconverter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class converter {
    public static void main(String[] args) {
        String filePath = "./xml.txt";
        File file = new File(filePath);
        String string="";

        //--------------read file---------------
        try {
            string = readFileAsString(filePath);
        }catch (Exception e){
            System.out.println("Cannot read file: " + e.getMessage());
        }
        //--------------------------------------

//        string=string.replaceAll("><",">\n<");

        String result = "";
        switch (string.substring(0, 1)) {
            case "<":
                result = convertXmlToJson(string);
                break;
            case "{":
                result = convertJsonToXml(string);
                break;
        }
        System.out.println(result);
    }



    public static String convertJsonToXml (String str){
       str = (str.replaceAll("[\\t\\v\\r\\n\\f]",""));
       str = str.replaceAll("\\}\\{","}\n{");
//        System.out.println("---------------------------------\n" + str + "\n-----------\n\n");

        Pattern noValue = Pattern.compile("\\{\\s?+\\\"[a-zA-Z0-9]+\\\"\\s?+:\\\"?\\s?+[\\w\\.\\\"]+\\s?+}");
        Matcher matchNoValue = noValue.matcher(str);

        while (matchNoValue.find()){
           // System.out.println(matchNoValue.group());
            String work = matchNoValue.group();
            String key = work.split(":")[0].split("\\{")[1].replaceAll("\"","");
            String value = work.split(":")[1].split("\\}")[0].replaceAll("\"","").trim();
            if (!"null".equals(value)){
            String res = "<"+key+">"+value+"</"+key+">\n";
            str = str.replace(work,res);
            } else {
                String res = "<"+key+"/>\n";
                str = str.replace(work,res);
            }
        }

        str = str.replaceAll("\\{\\s+\"", "{\"");
//        System.out.println("1:\n" + str);
        str = str.replaceAll(",\\s{2,}\"",", \"");
//        System.out.println("2:\n"+str);
        str = str.replaceAll("\\s{2,}\\}"," }");
//        System.out.println("3:\n"+str+"\n--------------------\n");

        Pattern withAttrs = Pattern.compile("\\{\\s?+\\\"\\w+\\\"\\s?+:[\\s?]+\\{.*?\\}?\\}");
        Matcher matchAttrs = withAttrs.matcher(str);

        while (matchAttrs.find()){
            String res="";
            String work = matchAttrs.group();
            String tag = work.split(" ")[0].split("\\{")[1].replaceAll("\"","");
//            System.out.println("THIS: " + work);
            String attrs = jsonAttributeSearch(work);
            String value = jsonValueSearch(work);
//            System.out.println("GET VALUE:"+value);
            if (!value.equals("")) {
                 res = "<" + tag + " " + attrs + ">" + value + "</" + tag + ">";
            } else {
                 res = "<"+tag+" "+attrs+"/>";
            }
            str = str.replace(work,res);
        }




        return str;

    }



    public static String convertXmlToJson(String str) {
        String attributesString ="";

        Pattern tagIsNull = Pattern.compile("<[a-zA-Z0-9]+\\/>");
        Matcher matcIsNull = tagIsNull.matcher(str);

        while(matcIsNull.find()){
            str = str.replaceAll(matcIsNull.group(),"{\""+matcIsNull.group().replaceAll("<","").replaceAll("/>","")+"\": null }\n");
        }

        Pattern onlyValue = Pattern.compile("<[a-zA-Z0-9]+>.*?<\\/[a-zA-Z0-9]+>");
        Matcher matchOnlyValue = onlyValue.matcher(str);

        while (matchOnlyValue.find()){
            String tag = matchOnlyValue.group().split(">")[0].replaceAll("<","");
            String value = matchOnlyValue.group().split(">")[1].split("<")[0].trim();
            str = str.replaceAll(matchOnlyValue.group(),"{\""+tag+"\" : \""+value+"\"}\n");

        }

        Pattern attrsWithoutValue = Pattern.compile("<\\s?+\\w+\\s+?(\\w+\\s?+=\\s?+.*?)+\\/>");
        Matcher matchAttrsWithout = attrsWithoutValue.matcher(str);

        while (matchAttrsWithout.find()){
            String work = matchAttrsWithout.group();
           // attributesString += attributesSearch(work);
            String key = work.split("<")[1].trim().split(" ")[0];
            String res = "{\n\"" + key +"\" : {\n" + xmlAttributesSearch(work) +"\"#" + key + "\" : null\n}\n}\n";
            str = str.replaceAll(work,res);
        }

        Pattern attrsAndValue = Pattern.compile("<\\s?+\\w+\\s+?(\\w+\\s?+=\\s?+\".*?\")+\\s?+>.*?<\\/[a-zA-Z0-9]+>");
        Matcher matchAttrsAndValue = attrsAndValue.matcher(str);

        while (matchAttrsAndValue.find()){
            String work = matchAttrsAndValue.group();
            String value = work.split(">")[1].split("<")[0].trim();
            String key = work.split("<")[1].trim().split(" ")[0];
            String res = "{\n\"" + key +"\" : {\n" + xmlAttributesSearch(work) +"\"#" + key + "\" : \"" + value + "\"\n}\n}\n";
            str = str.replaceAll(work,res);
        }


        return str;
    }

    public static String xmlAttributesSearch(String str){
        String result="";
        Pattern attributes = Pattern.compile("[a-zA-Z0-9]+\\s?+=\\s?+(\\\".*?\\\")");
        Matcher attributesMatch = attributes.matcher(str);
        while (attributesMatch.find()){
            String value = attributesMatch.group().split("=")[1].replaceAll("\"","").trim();
            String key = attributesMatch.group().split("=")[0].trim();
//            System.out.println("KEYYYY:" + key);
            result += "\"@"+ key +"\" : \""+ value +"\",\n";
        }
     return result;
    }

    public static String jsonAttributeSearch (String str){
        String result = "";
        Pattern attributes = Pattern.compile("\\\"[@][\\w_]+\\\"\\s?+:\\s?+[\\\"]?(.*?)?[\\\"]?,");
        Matcher attributesMatch = attributes.matcher(str);
        while (attributesMatch.find()){
            String work = attributesMatch.group();
            String key = work.split(":")[0].split("\"@")[1].replace("\"","");
            String value = work.split(":")[1].replace("\",","\"").trim();
            if (!value.contains("\"")){
                value = "\""+value.replace(",","\"");
            }
            result += key + " = " + value+" ";

        }
        return result;
    }

    public static String jsonValueSearch (String str){
        String result="";
        Pattern jsonValue = Pattern.compile("\\\"[#][\\w_]+\\\"\\s?+:\\s?+[\\\"]?(.*)[\\\"]?");
        Matcher valueMatcher = jsonValue.matcher(str);
        while (valueMatcher.find()){
            String work = valueMatcher.group().replaceAll("\\}\\}","");
            String value = work.split(":")[1].trim();
            if (value.equals("null")){
                value = "";
            } else {
                value = value.replaceAll("\"","");
            }
            result = value;
        }
        return result;
    }


    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
