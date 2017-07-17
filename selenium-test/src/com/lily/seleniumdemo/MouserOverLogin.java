package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 模拟鼠标，显示悬浮下拉窗体
 * 1、找到目标元素
 * 2、新建模拟鼠标对象（通过WebDriver封装的一个类Actions）
 * 3、将鼠标移动到元素上（将模拟的事件构建成一个操作）
 * 4、调用perform释放操作（即释放鼠标）
 * @author Lily
 *
 */
public class MouserOverLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver dr =new ChromeDriver();
		dr.get("https://www.jd.com/");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element=dr.findElement(By.linkText("我的京东"));
		Actions action=new Actions(dr);
		action.moveToElement(element).build();
		
		Select option=new Select(element);
		option.selectByVisibleText("待处理订单");
		//dr.close();
		
		
		//dr.findElement(By.xpath("*[@id="ttbar-myjd"]/div[2]/div[2]/div[2]/div[2]/a/text()")).click();
				

		//dr.findElement(By.linkText("待处理订单")).click();
		//action.moveToElement(element).perform();
		
	}

}
