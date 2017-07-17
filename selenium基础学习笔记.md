#Selenium
##Selenium概述
###Selenium介绍  
其不是一个单一的工具，而是一套工具，帮助测试者更有效的基于Web应用程序的自动化

* Selenium IDE：Selenium集成开发环境（IDE）是一个Firefox插件，可以记录测试人员的测试工作流程
* Selenium RC:Selenium远程控制（RC）为旗舰测试框架，它允许多个简单的浏览器动作和线性执行。
* Selenium WebDriver：直接发送命令给浏览器，并检索结果

##Selenium WebDriver

###操作浏览器的五种方法
1、浏览器最大化  
2、浏览器前进  
3、浏览器后退  
4、浏览器刷新  
5、浏览器切换窗口  
###元素定位

* id:dom元素首选定位方式。Bu.id("kw")
* name:表单定位name首选，因为表单肯定会有一个name属性
* class:一般代表某种样式属性，很有可能重复，不能精准定位
* linkText:链接定位
* xpath：使用部分属性值匹配。
* css：By.cssSelector("input[name='username']")

###下拉框处理 
  
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
