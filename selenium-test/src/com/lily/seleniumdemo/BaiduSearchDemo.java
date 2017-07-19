package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**百度搜索框的自动化测试
 * 1、打开百度页面，找到输入框，传值，然后点击搜索按钮
 * 2、在搜索结果页，定位第6个结果，获取该位置的文字内容
 * 3、通过断言判断是否包含指定文字，点击第6个结果
 * 5、切换页面到最新页面
 * 4、获得最新页的title，打印出来
 * @author Administrator
 *
 */
public class BaiduSearchDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.baidu.com/");
		dr.findElement(By.id("kw")).sendKeys("Selenium");
		dr.findElement(By.id("su")).click();
		WebElement element =dr.findElement(By.linkText("功能自动化测试工具——Selenium篇"));
		//WebElement element=dr.findElement(By.xpath("//*[@id='2']/h3/a"));
		////*[@id="2"]/h3/a
		assert element.getText().contains("Selenium");
		element.click();
		
		for(String handle:dr.getWindowHandles()){
			dr.switchTo().window(handle);
		}
		String title=dr.getTitle();
		assert title.contains("Selenium");
		System.out.println("current windows title :"+title);
	}

}
