package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToWin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/软件/selenium/selenium-2.42.2/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://testing2.marketadmin.yongche.org/mall/product/add");
		dr.findElement(By.id("J_login")).sendKeys("bolili");
		dr.findElement(By.id("J_pwd")).sendKeys("Bo123456");
		dr.findElement(By.id("id_submit")).click();
		
		WebElement element =dr.findElement(By.name("type"));
		Select option=new Select(element);
		//option.selectByIndex(2);//通过下拉框的index标识，一般从0开始，表示第一个选项
		option.selectByValue("3");//通过下拉框option标签下的value属性值来定位
		//option.selectByVisibleText("兑换码类商品");//根据option选项的文本内容来定位

	}

}
