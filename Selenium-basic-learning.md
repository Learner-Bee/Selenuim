#Selenium
##Selenium概述
###Selenium介绍  
其不是一个单一的工具，而是一套工具，帮助测试者更有效的基于Web应用程序的自动化

* Selenium IDE：Selenium集成开发环境（IDE）是一个Firefox插件，可以记录测试人员的测试工作流程
* Selenium RC:Selenium远程控制（RC）为旗舰测试框架，它允许多个简单的浏览器动作和线性执行。
* Selenium WebDriver：直接发送命令给浏览器，并检索结果

##Selenium WebDriver

##1、操作浏览器
* 浏览器最大化  dr.manage().window().maximize();
* 浏览器前进   dr.navigate().forward()  
* 浏览器后退  dr.navigate().back();  
* 浏览器刷新  dr.navigate().refresh();
* 退出浏览器   dr.quit();
* 设置浏览器高度和宽度  dr.manage().window().setSize(new Dimension(800,600));
* 隐式等待  dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
* 浏览器切换窗口   
##2、元素定位

* id:dom元素首选定位方式。Bu.id("kw")
* name:表单定位name首选，因为表单肯定会有一个name属性
* class:一般代表某种样式属性，很有可能重复，不能精准定位
* linkText:链接定位
* xpath：使用部分属性值匹配。
* css：By.cssSelector("input[name='username']")

##3、下拉框处理 
  
1、多选   
<select id="fruits"  multiple="multiple">  
<option value="banana" >banana</option>  
<option value="apple">apple</option>  
</select>    
2、单选  
<select id="fruits" >  
<option value="banana" >banana</option>  
<option value="apple">apple</option>  
</select>  
  
multiple：属性规定输入字段可以选择多个值

例：  
1、 //定义下拉框对象select  
Select seleect=new Select(element);   
2、选择

* 通过index选择：select.selectByIndex(0); // 从0开始   
* 通过选项可见内容 ：select.selectByVisableText("apple")；  
* 通过选项的value属性的值 ：select.selectByValue("banana")  


##4、文本框操作
1、赋值：dr.findElement().sendKeys("hello");  
2、清空文本框：dr.findElement().clear();

**上传文件**  
1、定位上传控件  
WebElement element=dr.findElement(By.);  
2、定义一个本地文件路径  
String filePath="d:\\*****"  
3、上传文件  
element.sendKeys(filePath);
##5、单选框  
判断单选框是否被选中  
element.isSelect();
##6、警告框处理  
1、声明对话框变量  
Alert al =dr.switchTo().alert();//切换到对话框  
2、接受现有警告框。即点击弹框中的确定操作  
al.accept();  
3、解散现有警告框。即点击弹框中的取消  
al.dismiss()  
4、发送文本至警告框  
la.sendKeys("")
##7、鼠标操作
新建鼠标模拟对象  
Action action =new Action(dr);

* 右击：action.contextClick();
* 双击：action.doubleClick();
* 悬停：action.moveToElement();
* 拖拽：action.drapAndDrop();

##8、键盘操作

* action.sendKeys(element,Keys.SHIT);shift键
* action.sendKeys(element,Keys.CONTROL,"a");键盘操作ctr+A

或

* action.keyDown(element,keys.SHIT).sendKeys("").keyUP(element,keys.SHIT);//通过键盘操作输入数据
* .build();//获得操作action
* ac.perform();//执行动作

##框架（Framework）

1、什么是框架？
框架是整个或部分系统的可重用设计，表现为一组抽象构件及构件实例间交互的方法。另一种定义认为，框架是可被应用开发者定制的应用骨架