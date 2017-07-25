package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://marketadmin.yongche.com/mall/product/add");
		dr.findElement(By.id("J_login")).sendKeys("bolili");
		dr.findElement(By.id("J_pwd")).sendKeys("Bo123456");
		dr.findElement(By.id("id_submit")).click();
		
		WebElement element=dr.findElement(By.name("type"));
		Select option=new Select(element);
		option.selectByIndex(3);
		
		WebElement element2=dr.findElement(By.id("upCodeFile"));
		//String filepath="filepath.csv";
		element.sendKeys("E:/learn/Selenuim/filepath.csv");
		Thread.sleep(5000);
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.id("btn_upCodeFile")).click();

	}

}
