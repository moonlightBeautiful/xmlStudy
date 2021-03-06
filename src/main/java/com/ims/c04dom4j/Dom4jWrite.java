package com.ims.c04dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 写xml文件
 */
public class Dom4jWrite {

    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();

        Element studentElement = document.addElement("student");
        studentElement.addAttribute("id", "001");
        studentElement.addAttribute("grade", "大一");

        Element name = studentElement.addElement("name");
        name.setText("张三");
        Element sex = studentElement.addElement("sex");
        sex.setText("男");
        Element age = studentElement.addElement("age");
        age.setText("20");

        studentElement.remove(name);
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        try {
            XMLWriter writer = new XMLWriter(new FileOutputStream("src/main/resources/studentDom4j.xml"), format);
            writer.write(document);
            writer.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
