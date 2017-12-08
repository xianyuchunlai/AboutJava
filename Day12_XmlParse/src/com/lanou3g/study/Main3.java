package com.lanou3g.study;

import org.dom4j.DocumentHelper;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {

        //创建一个Document对象
        Document document = DocumentHelper.createDocument();


        //在document对象中，添加一个元素
        //元素的名字为student
        //并且，将添加这个元素，
        //返回给element这个引用
        Element element =
                document.addElement("students");

        element.addText("我是一堆学生");
        Element student = element.addElement("student");

        student.addAttribute("name", "张三");



        student.addText("我是张三的文本");
        Element score = element.addElement("s");
        score.setText("100");
        OutputFormat outputformat = OutputFormat.createPrettyPrint();

        outputformat.setEncoding("utf-8");


        XMLWriter xmlWriter =
                new XMLWriter(new FileWriter("src/output.xml"), outputformat);

        xmlWriter.write(document);

        //将这个工具关闭，并把工具中的内容写入到目标文件
        xmlWriter.close();

    }
}
