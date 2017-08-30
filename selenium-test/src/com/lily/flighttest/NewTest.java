package com.lily.flighttest;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class NewTest {

	@Test
	public void f() {
		
		// 获取航班信息接口
		String baseurl = "https://testing.flight.yongche.org/Flight/getByFlightNumber";
		
		String flight_number = "";
		String dep_date = "";
		String force = "";
		String is_local_time = "";
		String out_coord_type = "";

		String url = baseurl + "?" + "flight_number=" + flight_number + "dep_date=" + dep_date + "force=" + force
				+ "is_local_time=" + is_local_time + "out_coord_type=" + out_coord_type;

		try {

			// 发出请求，获取结果
			String result = HttpClientUtil.httpClientGet(url);
			System.out.println(result);

			// 解析结果
			JSONObject jsonObject = (JSONObject) JSONObject.parse(result);
			JSONArray jsonArray = (JSONArray) jsonObject.get("result");
			JSONObject firsrObject = (JSONObject) jsonArray.get(0);
			String flightNo = firsrObject.get("No").toString();

			// 断言判断
			Assert.assertEquals("assert", "123XXX", flightNo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
