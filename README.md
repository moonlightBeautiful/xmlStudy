#xml的学习
xml简介：
    xml（Extensible Markup Language） 可扩展标记语言，简单的说就是描述数据的方式。用于数据交换、系统配置等
    常见的解析xml的方式：dom、sax、jdom、dom4j，貌似一般都使用dom4j
    元素vs节点
        节点：节点范围比较广，包含元素节点、属性节点、文本节点。
        元素：就是标签对，包含里面的内容。
dom方式解析xml：
    简介：
        把整个xml文档记载到内存，转换为dom树。
    优点：
        灵活性强，速度快，可以随机访问dom树的任何数据。
    缺点：
        占内存。
sax方式解析xml：
    简介：
        对xml文档顺序扫描，需要继承DefaultHandler。
    优点：
        消耗资源少，适合大文件解析。
    缺点：
        只能读取，不能修改。
jdom方式解析xml：
    读写xml的组件，要引入jdom包，
    优点：方便
    缺点：写一个xml文件，不能帮我们格式化。     
dom4j方式解析xml：以后就用这个
    优点：要引入jar包，
        功能强大，非常易用，开源，总之就2个字，优秀。
    
        