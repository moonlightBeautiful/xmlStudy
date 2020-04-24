#xml的学习
xml简介：
    xml（Extensible Markup Language） 可扩展标记语言，简单的说就是描述数据的方式。主要用于数据交换、系统配置等
    常见的解析xml的方式：dom、sax、jdom、dom4j，现在一般都使用dom4j
    元素vs节点
        节点：节点范围比较广，包含元素节点、属性节点、文本节点。
        元素：就是标签对，包含里面的内容。
    xml文件结构：
        <?xml version="1.0" encoding="UTF-8"?>
        <标签对 属性>内容 
        </标签对>   
    DTD 
        xml的语法，定义标签的限制、意义。
1.dom方式解析xml：
    jre自带，不需要引入额外jar包
    原理：
        把整个xml文档记载到内存，转换为dom树，程序可以随机访问dom树的任何数据。
    优点：
        灵活性强，速度快，可以随机访问dom树的任何数据。
    缺点：
        占内存。
    语法：
        element是node子类
2.sax方式解析xml：
    jre自带，不需要引入额外jar包
    原理：
        对xml文档顺序扫描，需要继承DefaultHandler，重写5个方法：文档扫描开始与结束、元素开始与结束、扫描元素内容。
    优点：
        消耗资源少，适合大文件解析。
    缺点：
        只能读取，不能修改。
3.jdom方式解析xml：
    读写xml的java组件，要引入jdom包
        <dependency>
            <groupId>org.jdom</groupId>
            <artifactId>jdom</artifactId>
            <version>2.0.2</version>
        </dependency>
    优点：
        方便，面向对象
    缺点：
        输出一个xml文件，不能帮我们格式化，都在一行。     
4.dom4j方式解析xml：以后就用这个
    读写xml的java组件，要引入dom4j包
         <dependency>
            <groupId>dom4j</groupId>
            <artifactId>dom4j</artifactId>
            <version>1.6.1</version>
        </dependency>
    优点
        功能强大，非常易用，开源，总之就2个字，优秀。就用它。
    
        