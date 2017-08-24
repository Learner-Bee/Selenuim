package com.lily.marketadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddProduct {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver dr =new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://testing2.marketadmin.yongche.org/mall/product/add");
	  dr.findElement(By.id("J_login")).sendKeys("bolili");
	  dr.findElement(By.id("J_pwd")).sendKeys("Bo123456");
	  dr.findElement(By.id("id_submit")).click();
	  
	  //选择商品类型
	  WebElement prutype=dr.findElement(By.name("type"));
	  Select option1=new Select(prutype);
	  option1.selectByValue("5");;
	  //选择商品属性
	  WebElement pruproperty =dr.findElement(By.id("is_test"));
	  Select option2=new Select(pruproperty);
	  option2.selectByValue("1");
	  //商品名称
	  dr.findElement(By.id("name")).sendKeys("Sel-Test01");
	  //所属商家
	  WebElement shopname=dr.findElement(By.name("shop_id"));
	  Select option3=new Select(shopname);
	  option3.selectByValue("167");
	  //商品展示图片
	  dr.findElement(By.name("upPic0")).sendKeys("E:/learn/Selenuim/page/product.png");
	  //商品缩略图
	  dr.findElement(By.name("upPic5")).sendKeys("E:/learn/Selenuim/page/suolue.png");
	  //商品备注
	  dr.findElement(By.name("note")).sendKeys("product remarks");
	  //商品内容介绍(富文本编辑器)
	  WebElement iframe=dr.findElement(By.tagName("iframe"));
	  dr.switchTo().frame(iframe);
	  dr.findElement(By.tagName("body")).sendKeys("peoduct producu");
	  dr.switchTo().defaultContent();//切回主文档
	  
	  //客服热线、联系说明
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/section/ng-form/div[11]/div[1]/input")).sendKeys("4008888888");
	  dr.findElement(By.name("item_intro")).sendKeys("联系说明");
	  //商品类别
	  WebElement category0=dr.findElement(By.id("category0"));
	  Select option4=new Select(category0);
	  option4.selectByValue("141");
	  dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  WebElement category1=dr.findElement(By.id("category1"));
	  Select option5=new Select(category1);
	  option5.selectByValue("143");
	  //商品售价、库存
	  dr.findElement(By.id("base_price")).sendKeys("100");
	  dr.findElement(By.name("stock")).sendKeys("100");
	  //成本方式
	  WebElement original_type=dr.findElement(By.id("original_type"));
	  Select option6=new Select(original_type);
	  option6.selectByValue("1");
	  //商品成本价格
	  dr.findElement(By.id("original_price")).sendKeys("50");
	  //商品优惠
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/section/ng-form/div[23]/div[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("100");
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/section/ng-form/div[23]/div[1]/table/tbody/tr[2]/td[2]/input")).sendKeys("100");
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/section/ng-form/div[23]/div[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("100");
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/section/ng-form/div[23]/div[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("100");
	  //预热时间
	  dr.findElement(By.id("pre_sell_time")).sendKeys("2017-09-25 14:50");
	  //预热对象
	  //WebElement pre_sell_user=dr.findElement(By.c("")))
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/section/ng-form/div[26]/div[1]/div/label[1]/input")).click();
	  //上架时间
	  dr.findElement(By.id("sell_start_time")).sendKeys("2017-09-26 14:50");
	  //提交
	  dr.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/button[2]")).click();
	  //创建成功处理
	  //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  Alert alert=dr.switchTo().alert();
	  if(alert.getText().contains("创建成功")){
		  alert.accept();
	  }
	  //dr.quit();
	
  }
}
