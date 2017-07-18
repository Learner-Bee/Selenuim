package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 模拟鼠标，显示悬浮下拉窗体
 * 1、找到目标元素
 * 2、新建模拟鼠标对象（通过WebDriver封装的一个类Actions）
 * 3、将鼠标移动到元素上（利用moveToElement（element）.build().perform()实现悬停）
 * 4、点击隐藏的下拉菜单中的link（通过findElement(By.linkText(""))）
 * @author Lily
 *
 */
public class MouserOverLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.get("https://www.baidu.com/");
		dr.manage().window().maximize();
		WebElement element=dr.findElement(By.linkText("设置"));
		Actions action=new Actions(dr);
		action.moveToElement(element).build().perform();
		//mouserOverlogin.perform();
		dr.findElement(By.linkText("搜索设置")).click();
		//dr.close();
		
		
		
				

		
		
		
	}

}
