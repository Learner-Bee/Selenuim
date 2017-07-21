package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class login-testcase {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://sso.yongche.org/auth/login?app_id=39&done=https%3A%2F%2Ftesting2.marketadmin.yongche.org%2Fmall%2Fproduct%2Fadd&cn=E&idle=1");
		selenium.start();
	}

	@Test
	public void testLogin-testcase() throws Exception {
		selenium.open("/auth/login?app_id=39&done=https%3A%2F%2Ftesting2.marketadmin.yongche.org%2Fmall%2Fproduct%2Fadd&cn=E&idle=1");
		selenium.type("id=J_login", "bolili");
		selenium.click("id=id_submit");
		assertEquals("bolili", selenium.getValue("id=J_login"));
		assertEquals("", selenium.getValue("id=J_pwd"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
