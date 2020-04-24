package com.ims.c02sax;

import com.ims.c02sax.model.Student;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class SaxStudents extends DefaultHandler {
    private List<Student> students = null;
    private Student student = null;
    private String preTag = null; // 元素节点名称

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void startDocument() {
        System.out.println("开始读取学生信息");
        students = new ArrayList<Student>();
    }

    @Override
    public void endDocument() {
        System.out.println("学生信息读取完毕");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if ("student".equals(qName)) {
            student = new Student();
            student.setId(attributes.getValue(0));
        }
        preTag = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if ("student".equals(qName)) {
            students.add(student);
            student = null;
        }
        preTag = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (preTag != null) {
            String content = new String(ch, start, length);
            if ("name".equals(preTag)) {
                student.setName(content);
            } else if ("sex".equals(preTag)) {
                student.setSex(content);
            } else if ("age".equals(preTag)) {
                student.setAge(Integer.parseInt(content));
            }
        }
    }

}
