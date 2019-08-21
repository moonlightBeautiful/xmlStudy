package com.java1234.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

/**
 * 读xml文件
 */
public class DOM4J02 {

    public static void main(String[] args) throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/main/resources/students.xml");

        Element rootElement = document.getRootElement();
        Iterator iter = rootElement.elementIterator();
        while (iter.hasNext()) {
            Element studentElement = (Element) iter.next();
            System.out.println("学号：" + studentElement.attributeValue("id"));
            System.out.println("姓名：" + studentElement.elementText("name"));
            System.out.println("性别：" + studentElement.elementText("sex"));
            System.out.println("年龄：" + studentElement.elementText("age"));
            System.out.println("================================================");
        }
    }
}
