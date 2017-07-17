package com.lily.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=selenium&rsv_pq=f46b5a9800008ffa&rsv_t=4c88uSEwEpRZCK9nFEaiLTxCm613M9kwN%2B09HjHlBSgNgFUIAJ3WfNCmw8w&rqlang=cn&rsv_enter=1&rsv_sug3=1/");
		
		String title=dr.getTitle();//获取当前页面的title属性。一般利用这个属性可以判断页面是否跳转
		System.out.println(title);
		
		String pagesource=dr.getPageSource();//获取当前页面的源码
		//System.out.println(pagesource);
		
		String currentUrl=dr.getCurrentUrl();
		System.out.println(currentUrl);//获取当前url地址
		
		WebElement element =dr.findElement(By.xpath(".//*[@id='1']/h3/a[1]"));//通过xpath定位元素的位置
		String a=element.getAttribute("id");//获取属性值
		String b=element.getText();//利用定位，获取该元素的文字信息
		System.out.println(a);
		System.out.println(b);
		
		dr.quit();

	}

}
