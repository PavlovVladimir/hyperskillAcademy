package com.hyperskilldev.XmlTOJson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlToJsonConverter {
    public static void main(String[] args) {
        String filePath = "./testJSON.txt";
        File file = new File(filePath);
//        Scanner scanner = new Scanner();
        String string="";

        //--------------read file---------------
        try {
           string = readFileAsString(filePath);
        }catch (Exception e){
            System.out.println("Cannot read file: " + e.getMessage());
        }
        //--------------------------------------
//        string = "<person rate = \"1\" name = \"Torvalds\" />";
        string="{\n" +
                "    \"person\" : {\n" +
                "        \"@rate\" : \"1\",\n" +
                "        \"@name\" : \"Torvalds\",\n" +
                "        \"#person\" : null\n" +
                "    }\n" +
                "}";


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

    public static String convertXmlToJson(String str) {
        String result = "";
        /*-------------pattern <success/> --------*/
//        Pattern tagIsNull = Pattern.compile("<[a-zA-Z0-9]+\\/>");
//        Matcher matcIsNull = tagIsNull.matcher(str);
//        while(matcIsNull.find()){
//            result += "{\""+matcIsNull.group().replaceAll("<","").replaceAll("/>","")+
//                    "\": null }";
//        }

        /*------------pattern <jdk>1.8.9</jdk>---*/

//        Pattern onlyValuePattern = Pattern.compile("<[a-zA-Z0-9]+>.*?<\\/[a-zA-Z0-9]+>");
//        Matcher matchOnlyValue = onlyValuePattern.matcher(str);
//        while (matchOnlyValue.find()){
//            String value = matchOnlyValue.group().split(">")[1].split("<")[0];
//            String key = matchOnlyValue.group().split("<")[1].split(">")[0];
//            result += "{\""+key+"\":\""+value+"\"}";
//        }

        /*-------pattern <employee department = "manager">Garry Smith</employee> ---*/

//        Pattern attrWithValue = Pattern.compile("<.*?=+.*?>.*?<\\/.*?>");
//        Matcher matchAttrWithValue = attrWithValue.matcher(str);
//        Map<String,String> attrMap= new HashMap<>();
//
////        while (matchAttrWithValue.find()){
////////            String key = matchAttrWithValue.group().split("=")[0];
////////            String value = matchAttrWithValue.group().split("=")[1];
////////            attrMap.put(key,value);
//////            System.out.println(matchAttrWithValue.group());
//////        }
//////        System.out.println(attrMap.toString());



//      String work="";
//        String key="";
//        String value="";

//        work=str.replaceAll("[a-z]","");
//        if (work.equals("</>")){
//            key = str.replaceAll("<","").replaceAll("/>","");
//            value = "null";
//            result = "{\"" + key + "\": " + value + " }";
//            return result;
//        } else {
//            key = str.split("<")[1].split(">")[0];
//            value = str.split(">")[1].split("<")[0];
//        }
//
//         result =  "{\"" + key + "\":\"" + value + "\"}";
       /*---------Here we find all attributes--------------------*/
        Map<String,String> attrMap= new HashMap<>();
        Pattern attrPattern = Pattern.compile("[a-z]+\\s?+=\\s?+\"[a-zA-Z0-9]+\"");
        Matcher attrMatcher = attrPattern.matcher(str);
        while (attrMatcher.find()){
            String keyK = attrMatcher.group().split("=")[0];
            String valueV = attrMatcher.group().split("=")[1];
            attrMap.put(keyK,valueV);
        }

        /*------------Lets find value--------------------*/
        Pattern valuePattern = Pattern.compile(">.+<");
        Matcher valueMatcher = valuePattern.matcher(str);
       String value;//=str.replaceAll("<.+?>","");
        if (valueMatcher.find()) {
            value = "\""+valueMatcher.group().replaceAll(">|<", "")+"\"";
        } else {
            value = "null";
        }
        /*--------------Lets find tag name--------------*/
        Pattern tagPattern = Pattern.compile("<[a-zA-Z0-9]+");
        Matcher tagMatcher = tagPattern.matcher(str);
        tagMatcher.find();
        String tag = tagMatcher.group().replaceAll("<","");
        /*------------Format attributes------------------*/
        String attributes="";
        for (Map.Entry<String,String> attrs:attrMap.entrySet()){
            attributes += "\"@"+attrs.getKey().trim()+"\" :" + attrs.getValue()+",\n";
        }

        result = "{\n" + tag  + " : {\n " + attributes  + " \"#"+tag+"\" : "+value +" \n"+"}\n" + "}";
        return result;
    }

    public static String convertJsonToXml (String str){
//        String work="";
//        String key="";
//        String value="";
//        String result = "";
//        work = str.replaceAll(" ","").replaceAll("\"","").split(":")[1];
//
//        if (work.equals("null}")){
//            key = str.split("\"")[1].split("\"")[0];
//            result= "<" + key + "/>";
//            return result;
//        } else {
//            key = str.split("\"")[1].split("\"")[0];
//            value = work.replaceAll("}","");
//        }
//
//        result = "<" + key + ">" + value + "</" + key + ">";
        String result = "";
        String tag="";
        String attrs = "";
        Pattern tagPattern = Pattern.compile("\\{\\s+\"[a-z0-9]+\"",Pattern.CASE_INSENSITIVE);
        Matcher matcher = tagPattern.matcher(str);
        if (matcher.find()){
        tag = matcher.group().split("\"")[1].split("\"")[0];
        }

        Pattern attrPattern = Pattern.compile("@.*?:.*?\\,",Pattern.CASE_INSENSITIVE);
        Matcher attrMatch = attrPattern.matcher(str);
        while (attrMatch.find()){
            attrs += " " + attrMatch.group().split("@")[1].split("\"")[0] + " = "+ attrMatch.group().split(":")[1].replaceAll(","," ");
        }

        String value="";

        Pattern valuePattern  = Pattern.compile("\"#.*:.*\"");
        Matcher valueMatch = valuePattern.matcher(str);
        if(valueMatch.find()){
            value = valueMatch.group().split(":")[1].replaceAll("\"","");
        }

        //result = "<"+ tag+">";
        if (value.equals("")){
            result = "<" + tag + " " + attrs + "/>";
        }else {
            result = "<" + tag + " " + attrs + ">" + value + "</" + tag + ">";
        }


        return result;
    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
