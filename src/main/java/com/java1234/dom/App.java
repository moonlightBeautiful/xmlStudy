package com.java1234.dom;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class App {


    public static void main(String[] args) {
        try {
            /*
                dom方式读取xml文件，获取doc文件
             */
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("src/main/resources/students.xml");

            /*
                获取根元素
             */
            NodeList studentsNodes = (NodeList) doc.getElementsByTagName("students");
            Element studsents = (Element) studentsNodes.item(0);
             /*
                获取子节点们
             */
            NodeList studentNodes = studsents.getElementsByTagName("student");
            for (int i = 0; i < studentNodes.getLength(); i++) {
                Element student = (Element) studentNodes.item(i);
                NamedNodeMap studentAttributes = student.getAttributes();
                for (int j = 0; j < studentAttributes.getLength(); j++) {
                    Node attributeNode = studentAttributes.item(j);
                    System.out.println(attributeNode.getNodeName() + ":" + attributeNode.getFirstChild().getNodeValue());
                }
                NodeList nameNodes = student.getElementsByTagName("name");
                Element name = (Element) nameNodes.item(0);
                System.out.println("姓名：" + name.getFirstChild().getNodeValue());
                NodeList sexNodes = student.getElementsByTagName("sex");
                Element sex = (Element) sexNodes.item(0);
                System.out.println("性别：" + sex.getFirstChild().getNodeValue());
                NodeList ageNodes = student.getElementsByTagName("sex");
                Element age = (Element) ageNodes.item(0);
                System.out.println("年龄：" + age.getFirstChild().getNodeValue());
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
