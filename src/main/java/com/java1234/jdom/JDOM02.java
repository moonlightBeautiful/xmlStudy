package com.java1234.jdom;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.util.List;

/**
 * 读xml文件
 */
public class JDOM02 {

    public static void main(String[] args) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build("src/students.xml");
        Element students = document.getRootElement();
        List studentList = students.getChildren("student");
        for (int i = 0; i < studentList.size(); i++) {
            Element student = (Element) studentList.get(i);
            String id = student.getAttributeValue("id");
            String name = student.getChildText("name");
            String sex = student.getChildText("sex");
            String age = student.getChildText("age");
            System.out.println("ѧ�ţ�" + id + ";������" + name + ";�Ա�" + sex + ";���䣺" + age);
        }
    }
}
