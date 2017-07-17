package com.lily.seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * ģ����꣬��ʾ������������
 * 1���ҵ�Ŀ��Ԫ��
 * 2���½�ģ��������ͨ��WebDriver��װ��һ����Actions��
 * 3��������ƶ���Ԫ���ϣ���ģ����¼�������һ��������
 * 4������perform�ͷŲ��������ͷ���꣩
 * @author Lily
 *
 */
public class MouserOverLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver dr =new ChromeDriver();
		dr.get("https://www.jd.com/");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element=dr.findElement(By.linkText("�ҵľ���"));
		Actions action=new Actions(dr);
		action.moveToElement(element).build();
		
		Select option=new Select(element);
		option.selectByVisibleText("��������");
		//dr.close();
		
		
		//dr.findElement(By.xpath("*[@id="ttbar-myjd"]/div[2]/div[2]/div[2]/div[2]/a/text()")).click();
				

		//dr.findElement(By.linkText("��������")).click();
		//action.moveToElement(element).perform();
		
	}

}
