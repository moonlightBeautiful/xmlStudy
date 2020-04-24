package com.ims.c04dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * 读xml文件
 */
public class Dom4jRead {

    public static void main(String[] args) throws Exception {

        File file = new File("src/main/resources/students.xml");
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(file);

        Element students = document.getRootElement();
        Iterator studentIter = students.elementIterator();
        while (studentIter.hasNext()) {
            Element studentElement = (Element) studentIter.next();
            System.out.println("学号：" + studentElement.attributeValue("id"));
            System.out.println("姓名：" + studentElement.elementText("name"));
            System.out.println("性别：" + studentElement.elementText("sex"));
            System.out.println("年龄：" + studentElement.elementText("age"));
            System.out.println("================================================");
        }
    }
}
