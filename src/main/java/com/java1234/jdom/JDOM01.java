package com.java1234.jdom;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写xml文件
 */
public class JDOM01 {

    public static void main(String[] args) {
        Element student = new Element("student");

        Attribute id = new Attribute("id", "001");
        Attribute aa = new Attribute("aa", "xx");
        student.setAttribute(id);
        student.setAttribute(aa);

        Element name = new Element("name");
        name.setText("����");
        student.addContent(name);

        Element sex = new Element("sex");
        sex.setText("��");
        student.addContent(sex);

        Element age = new Element("age");
        age.setText("20");
        student.addContent(age);

        Document document = new Document(student);
        XMLOutputter out = new XMLOutputter();
        out.setFormat(out.getFormat().setEncoding("UTF-8"));

        try {
            out.output(document, new FileOutputStream("src/student2.xml"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
