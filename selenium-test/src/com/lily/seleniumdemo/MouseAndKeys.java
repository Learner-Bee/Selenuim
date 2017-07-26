package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

/**
 * 鼠标与键盘结合操作
 * 1、构建鼠标对象Actions，将鼠标移到指定元素输入框
 * 2、通过元素操作输入框内容，控制键盘大小写
 * @author Administrator
 *
 */
public class MouseAndKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.webdriver.org/nav1/");
		dr.manage().window().maximize();
		WebElement element=dr.findElement(By.id("scbar_txt"));
		Actions action=new Actions(dr);
		action.keyDown(element,Keys.SHIFT).sendKeys("webdriver").keyUp(element,Keys.SHIFT).build().perform();
	    
		//action.sendKeys(element, Keys.SHIFT).sendKeys("webdriver").perform();
		dr.findElement(By.id("scbar_btn")).click();

	}

}
