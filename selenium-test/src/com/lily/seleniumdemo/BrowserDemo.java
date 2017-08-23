package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 切换浏览器。返回上一级和前进到下一级
 * @author Administrator
 *
 */
public class BrowserDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver dr=new ChromeDriver();
        dr.get("http://www.yiibai.com/selenium/");
        dr.manage().window().maximize();//将窗口最大化
        dr.findElement(By.linkText("Selenium Webdriver")).click();
        try{
        	//dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        	Thread.sleep(5000);
        	
        }catch(InterruptedException e){
        	e.printStackTrace();
        }
        dr.navigate().back();//回退到上一页面
        dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        dr.navigate().forward();//按照浏览记录，前进到下一页面
        dr.navigate().refresh();//刷新页面
        dr.quit();
	}
	

}
