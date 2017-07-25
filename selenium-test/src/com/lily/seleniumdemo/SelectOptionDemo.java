package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://testing2.marketadmin.yongche.org/mall/product/add");
		dr.findElement(By.id("J_login")).sendKeys("bolili");
		dr.findElement(By.id("J_pwd")).sendKeys("Bo123456");
		dr.findElement(By.id("id_submit")).click();
		
		//页面下拉框处理，通过不同方式识别下拉框
		//WebElement element =dr.findElement(By.name("type"));
		//Select option=new Select(element);
		//option.selectByIndex(5);//通过下拉框的index标识，一般从0开始，表示第一个选项
		//option.selectByValue("5");//通过下拉框option标签下的value属性值来定位
		//option.selectByVisibleText("兑换码类商品");//根据option选项的文本内容来定位
        
		//页面单选框处理，判断是否被选中
		//WebElement element2=dr.findElement(By.name("level_id"));
        //Select option2=new Select(element);
        //option2.selectByValue("1");
        //System.out.println("银卡用户"+element.isSelected());
		
		//页面弹窗处理
		dr.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/button[2]")).click();
		dr.manage().window().maximize();
		Alert alert=dr.switchTo().alert();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String altext=alert.getText();
		if(altext.contains("请选择商品类型")){
			alert.accept();
		    System.out.println("alert is closed");
		}
		
		
	}

}
