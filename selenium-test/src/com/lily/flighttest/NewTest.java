package com.lily.flighttest;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  //获取航班信息接口
	  String baseurl="https://testing.flight.yongche.org/Flight/getByFlightNumber";
	  String flight_number="";
	  String dep_date="";
	  String force="";
	  String is_local_time="";
	  String out_coord_type="";
	  
	  String url=baseurl+"?"+"flight_number="+flight_number+"dep_date="+dep_date+"force="+force+"is_local_time="+is_local_time+"out_coord_type="+out_coord_type;
	  HttpClientUtil httpclientutil=new HttpClientUtil();
	  String result=httpclientutil.httpClientGet(url);
  }
}
