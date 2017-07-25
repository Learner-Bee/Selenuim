package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestNG {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver dr=new ChromeDriver();
	  dr.get("https://www.baidu.com/");
	  WebElement element=dr.findElement(By.id("kw"));
	  element.sendKeys("testNG");
	  String a=element.getAttribute("testNG");
	  dr.findElement(By.id("su")).click();
	  System.out.println(a);
	  
  }
}
