package com.lily.seleniumdemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 用handle切换浏览器
 * switchTo方法：
 * 1、分别获取当前页面的handle，和所有页面的handles集合
 * 2、循环遍历handles，与当前页handle比较，
 *   2.1一致继续循环
 *   2.2不一致，切换页面。再比较页面的tiele是否和给定的title一值
 *      2.2.1不一致，继续循环
 *      2.2.2一致，说明该页面就是要查找的页面。进行后续操作
 * 
 * @author Administrator
 *
 */
public class BrowserSwitch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.baidu.com/?tn=57095150_2_oem_dg");
		WebElement e1=dr.findElement(By.linkText("hao123"));
		WebElement e2=dr.findElement(By.linkText("地图"));
		Actions action=new Actions(dr);
		action.moveToElement(e1).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		action.moveToElement(e2).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

		//dr.findElement(By.linkText("视频")).click();
		switchTo("hao123_上网从这里开始",dr);
		dr.findElement(By.linkText("八卦娱乐")).click();

	}
	public static void switchTo(String wintitle,WebDriver dr ){
		boolean flag=false;
		String currenthandle=dr.getWindowHandle();
		Set<String> handles=dr.getWindowHandles();
		for(String s:handles){
			if(s.equals(currenthandle)){
				continue;
			}else{
				dr.switchTo().window(s);
				if(dr.getTitle().equals(wintitle)){
					flag=true;
					System.out.println("switch to window:"+wintitle+" success!");
					break;
				}else{
					continue;
				}
			}
		}
	}

}

