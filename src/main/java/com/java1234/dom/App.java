package com.java1234.dom;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class App {


    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/main/resources/students.xml");
            Element students = (Element) doc.getElementsByTagName("students").item(0);
            NodeList studentNodeList = students.getElementsByTagName("student");
            for (int i = 0; i < studentNodeList.getLength(); i++) {
                Element student = (Element) studentNodeList.item(i);
                Node nameNode = student.getElementsByTagName("name").item(0);
                System.out.println("姓名：" + nameNode.getFirstChild().getNodeValue());
                NamedNodeMap namedNodeAttributes = nameNode.getAttributes();
                for (int j = 0; j < namedNodeAttributes.getLength(); j++) {
                    Node attrNode = namedNodeAttributes.item(j);
                    System.out.println("  "+attrNode.getNodeName() + ":" + attrNode.getFirstChild().getNodeValue());
                }
                Node sexNode = student.getElementsByTagName("sex").item(0);
                System.out.println("性别：" + sexNode.getFirstChild().getNodeValue());
                Node ageNode = student.getElementsByTagName("age").item(0);
                System.out.println("年龄：" + ageNode.getFirstChild().getNodeValue());
                System.out.println("================");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
