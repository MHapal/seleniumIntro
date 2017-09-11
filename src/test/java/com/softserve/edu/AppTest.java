package com.softserve.edu;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest {
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public static void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@BeforeGroups
	public static void beforeGroups() {
		System.out.println("BeforeGroups");
	}
	
	@AfterGroups
	public static void afterGroups() {
		System.out.println("afterGroups");
	}
	
	@BeforeTest
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@AfterTest
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}
	
	@BeforeMethod
	public static void beforeMethod() throws Exception {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public static void afterMethod() throws Exception {
		System.out.println("AfterMethod");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd()");
		Calc calc = new Calc();
		// int expected;
		// int actual;
		double expected;
		double actual;
		expected = 4;
		actual = calc.add(1.0, 3.0);
		Assert.assertEquals(expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		System.out.println("testDiv()");
		Calc calc = new Calc();
		double expected;
		double actual;
		expected = 1.5;
		actual = calc.div(3, 2);
		Assert.assertEquals(expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test
	public void testDiv2() {
		System.out.println("testDiv2()");
		Calc calc = new Calc();
		double expected;
		double actual;
		expected = Double.POSITIVE_INFINITY;
		actual = calc.div(3, 0);
		Assert.assertEquals(expected, actual, 0.001);
		// fail("Not yet implemented");
	}

	@Test//(expectedExceptions = ArithmeticException.class)
	public void testDivTemp() {
		System.out.println("testDivTemp() START");
		int i = 0;
		//double i = 0;
		if (i < 2) {
			//throw new RuntimeException("Ha-Ha-HA");
			i = 1 / i;
			System.out.println("i=" + i);
		}
		System.out.println("testDivTemp() DONE");
		// fail("Not yet implemented");
	}
}
