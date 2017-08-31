package com.lily.flighttest;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author Administrator
 *
 */
public class HttpClientUtil {

	public static String httpClientGet(String url) throws IOException {

		// 创建HttpClientBuilder
		HttpClientBuilder httpclientbuilder = HttpClientBuilder.create();
		// 配置config，支持https请求
		configureHttpClient(httpclientbuilder);

		// 通过httpclientbuilder build一个可关闭的httpclient
		CloseableHttpClient httpclient = httpclientbuilder.build();
		try {

			// 实例一个httpget对象
			HttpGet httpget = new HttpGet(url);

			// 执行get请求，并获得结果
			CloseableHttpResponse response = httpclient.execute(httpget);

			// 获得响应结果的实体（即数据部分）
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toString(entity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接，释放资源
			httpclient.close();
		}
		return null;
	}

	public static String httpClientPost(String url, String param) {

		HttpClientBuilder httpclientbuilder = HttpClientBuilder.create();

		configureHttpClient(httpclientbuilder);

		CloseableHttpClient httpclient = httpclientbuilder.build();

		HttpPost httppost = new HttpPost(url);

		// 建立一个数组，用于存储欲传送的参数
		httppost.addHeader("Content-type", "application/json;charset=utf-8");
		httppost.setHeader("Accept", "application/json");
		httppost.setEntity(new StringEntity(param, Charset.forName("UTF-8")));
		try {
			CloseableHttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				return EntityUtils.toString(entity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 配置SSL，支持https调用
	 * 
	 * @author Administrator
	 *
	 */
	public static void configureHttpClient(HttpClientBuilder httpclientbulider) {
		try {
			SSLContext sslcontext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
				public boolean isTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws java.security.cert.CertificateException {
					return true;
				}
			}).build();
			httpclientbulider.setSSLContext(sslcontext);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
