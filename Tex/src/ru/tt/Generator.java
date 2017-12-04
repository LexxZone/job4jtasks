package ru.tt;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Generator {

    public static int PAGEWIDTH;
    public static int PAGEHEIGHT;
    private static String COLUMNTITLE1;
    private static int COLUMNWIDTH1;
    private static String COLUMNTITLE2;
    private static int COLUMNWIDTH2;
    private static String COLUMNTITLE3;
    private static int COLUMNWIDTH3;

    public static void main (String[] args) throws ParserConfigurationException, IOException, SAXException {

// read xml file -------------------------------------




        File file = new File("settings.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        NodeList nodeList1 = document.getElementsByTagName("page");
            for (int i = 0; i < nodeList1.getLength(); i++){

                Node node = nodeList1.item(i);
                System.out.println("\nCurrent Element : " + node.getNodeName());
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;

                    // парсим и присваиваем элементам параметры страницы
                    PAGEWIDTH = Integer.parseInt(element.getElementsByTagName("width").item(0).getTextContent());
                    PAGEHEIGHT = Integer.parseInt(element.getElementsByTagName("height").item(0).getTextContent());

                    System.out.println(PAGEWIDTH + " " + PAGEHEIGHT);
                }
            }

        NodeList nodeList2 = document.getElementsByTagName("columns");
            for (int i = 0; i < nodeList2.getLength(); i++) {
                Node node = nodeList2.item(i);
                System.out.println("\nCurrent Element : " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    COLUMNTITLE1 = element.getElementsByTagName("title").item(0).getTextContent();
                    COLUMNWIDTH1 = Integer.parseInt(element.getElementsByTagName("width").item(0).getTextContent());
                    COLUMNTITLE2 = element.getElementsByTagName("title").item(1).getTextContent();
                    COLUMNWIDTH2 = Integer.parseInt(element.getElementsByTagName("width").item(1).getTextContent());
                    COLUMNTITLE3 = element.getElementsByTagName("title").item(2).getTextContent();
                    COLUMNWIDTH3 = Integer.parseInt(element.getElementsByTagName("width").item(2).getTextContent());

                    System.out.println (COLUMNTITLE1 + " " + COLUMNWIDTH1 + "\n" + COLUMNTITLE2 + " " + COLUMNWIDTH2 + "\n" + COLUMNTITLE3 + " " + COLUMNWIDTH3);
                }
            }




    }











    // read source file ----------------------------------











    // create and write report file.txt ------------------





   /* public static void main (String [] args){
        System.out.println(PAGEWIDTH);
        System.out.println(PAGEHEIGHT);
        System.out.println(COLUMNTITLE1);
        System.out.println(COLUMNWIDTH1);
        System.out.println(COLUMNTITLE2);
        System.out.println(COLUMNWIDTH2);
        System.out.println(COLUMNTITLE3);
        System.out.println(COLUMNWIDTH3);


    } */









}
