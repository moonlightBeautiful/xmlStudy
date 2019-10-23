package com.java1234.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * 读xml文件
 */
public class DOM4J02 {

    public static void main(String[] args) throws Exception {
        String filePath = "src/main/resources/students.xml";
        File file = new File(filePath);
        // Simple Api for XML
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(file);

        Element rootElement = document.getRootElement();


        Element studentElement = rootElement.element("student");
        System.out.println("学号：" + studentElement.attributeValue("id"));
        System.out.println("姓名：" + studentElement.elementText("name"));
        System.out.println("性别：" + studentElement.elementText("sex"));
        System.out.println("年龄：" + studentElement.elementText("age"));
        System.out.println("================================================");
        /*//全部子元素迭代器
        Iterator iter = rootElement.elementIterator();*/
        //指定标签名子元素迭代器
        /*Iterator iter = rootElement.elementIterator("student");*/
        /*Iterator iter = rootElement.elementIterator();
        while (iter.hasNext()) {
            Element studentElement = (Element) iter.next();
            System.out.println("学号：" + studentElement.attributeValue("id"));
            System.out.println("姓名：" + studentElement.elementText("name"));
            System.out.println("性别：" + studentElement.elementText("sex"));
            System.out.println("年龄：" + studentElement.elementText("age"));
            System.out.println("================================================");
        }*/
    }
}
