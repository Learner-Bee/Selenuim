/**
 * 
 */
package com.lily.flighttest;

import org.junit.Assert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

/**
 * 
 * <pre>
 * 
 * {
    "result":[
        {
            "No":"123XXX",
            "Date":"20170828",
            "SA":"Beijing",
            "DA":"Shanghai"
        },
        {
            "No":"124XXX",
            "Date":"20170828",
            "SA":"Beijing",
            "DA":"Shanghai"
        },
        {
            "No":"125XXX",
            "Date":"20170828",
            "SA":"Beijing",
            "DA":"Shanghai"
        }
    ]
}
 * 
 * </pre>
 * 
 * @author Lily
 *
 */
public class JsonUtil {

	public static void main(String[] args) {

		String originalStr = "{\"result\":[{\"No\":\"123XXX\",\"Date\":\"20170828\",\"SA\":\"Beijing\",\"DA\":\"Shanghai\"},{\"No\":\"124XXX\",\"Date\":\"20170828\",\"SA\":\"Beijing\",\"DA\":\"Shanghai\"},{\"No\":\"125XXX\",\"Date\":\"20170828\",\"SA\":\"Beijing\",\"DA\":\"Shanghai\"}]}";
		JSONObject jsonObject = (JSONObject) JSONObject.parse(originalStr);
		JSONArray jsonArray = (JSONArray) jsonObject.get("result");
		JSONObject firsrObject = (JSONObject) jsonArray.get(0);
		String flightNo = firsrObject.get("No").toString();
		Assert.assertEquals("assert", "123XXX", flightNo);

		// for (Object object : jsonArray) {
		// JSONObject json = (JSONObject) object;
		// String actural = (String) json.get("Date");
		// Assert.assertEquals("����", "20170828", actural, delta);
		// }

	}

}
