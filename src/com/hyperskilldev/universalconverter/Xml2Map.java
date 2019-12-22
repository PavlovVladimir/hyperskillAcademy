package com.hyperskilldev.universalconverter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.beans.XMLDecoder;

public class Xml2Map {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static String getOpenTag (String str){
        Pattern tag = Pattern.compile("<\\s?+\\w+"); //for closed tag: <\/(.*?)(( +?.*?=.*?)*?)>
        Matcher matcher = tag.matcher(str);
        if (matcher.find()){
            return  matcher.group().replace("<","");
        } else {
            return "";
        }
    }

    public  static String getClosedTag (String str, String tag){
        //Pattern closedTag = Pattern.compile("<\\/(.*?)(( +?.*?=.*?)*?)>");

        Pattern closedTag = Pattern.compile("<\\/\\s?+" +tag+ "\\s?+>");
        Matcher matcher = closedTag.matcher(str);

        if (matcher.find()){
            return matcher.group();
        } else {
            return "";
        }


        }

    public static String parser (String str) {
        String parsedStr = "";
        if (str.isEmpty()) {
            return parsedStr;
        }
        String openTag = getOpenTag(str);
        String closedTag = getClosedTag(str,openTag);
        String node = str.split(">")[0]+">";
        System.out.println("DEBUG"+openTag);
        System.out.println("DEBUG"+closedTag);


            if (!openTag.equals("")&&!closedTag.equals("")){
                String toParse = str.split(closedTag)[0].split(node)[1];
                System.out.println("----------\n"+toParse);
                return parser(toParse);
            }
            return parser(str);
    }


    public static void main(String[] args) {
        String filepath = "./xml.txt";
        File file = new File(filepath);
        String xmlString = "";

        try {
            xmlString = readFileAsString (filepath);
        } catch (Exception e){
            System.out.println("Cannot read file" + filepath);
        }

        String openTag = getOpenTag(xmlString);
        System.out.println(openTag);
        System.out.println(getClosedTag(xmlString,openTag));
        parser(xmlString);

    }
}
