package com.lily.flighttest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class WeatherTest {

	@Test
	public void test() {
		String url="http://192.168.1.11:8080/tao/weather/110108";
		try {
			String result=HttpClientUtil.httpClientGet(url);
			//System.out.println(result);
			//解析结果
			JSONObject jsonObject1=(JSONObject)JSONObject.parse(result);
			JSONArray jsonArray1=(JSONArray) jsonObject1.get("forecasts");
			JSONObject jsonObject2=(JSONObject) jsonArray1.get(0);
			JSONArray jsonArray2=(JSONArray) jsonObject2.get("casts");
			JSONObject jsonObject3=(JSONObject) jsonArray2.get(1);	
			//Assert.assertArrayEquals(message, "多云", jsonObject3.get("dayweather"));
			//System.out.println(jsonObject3.get("dayweather"));
			String actural = "28";
			String returnResult = (String) jsonObject3.get("daytemp");
			assert  actural.equals(returnResult)  :  "fasle";
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
