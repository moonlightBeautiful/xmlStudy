package com.java1234.SAX;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class App {


    public static void main(String[] args) {
        try {
            /*
                dom方式读取xml文件
             */
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/main/resources/students.xml");

            /* 
                获取根节点
             */
            Element students = (Element) doc.getElementsByTagName("students").item(0);
            NodeList studentNodeList = students.getElementsByTagName("student");
            for (int i = 0; i < studentNodeList.getLength(); i++) {
                Element student = (Element) studentNodeList.item(i);
                Node nameNode = student.getElementsByTagName("name").item(0);
                System.out.println("姓名：" + nameNode.getFirstChild().getNodeValue());
                NamedNodeMap namedNodeAttributes = nameNode.getAttributes();
                for (int j = 0; j < namedNodeAttributes.getLength(); j++) {
                    Node attrNode = namedNodeAttributes.item(j);
                    System.out.println("  " + attrNode.getNodeName() + ":" + attrNode.getFirstChild().getNodeValue());
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
