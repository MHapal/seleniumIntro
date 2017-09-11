package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalcTestNG {

	@Test(groups = "group1")
	public void add() {
		System.out.println("Method add()");
		Calc target = new Calc(); // TODO: Initialize to an appropriate
		double a1 = 5; // TODO: Initialize to an appropriate value
		double a2 = 6; // TODO: Initialize to an appropriate value
		double expected = 11; // TODO: Initialize to an appropriate value
		double actual;
		actual = target.add(a1, a2);
		Assert.assertEquals(expected, actual);
		// throw new RuntimeException("Test not implemented");
	}

	@Test(groups = "group2")
	public void div() {
		System.out.println("Method div()");
		Calc target = new Calc(); // TODO: Initialize to an appropriate
		double a1 = 48; // TODO: Initialize to an appropriate value
		double a2 = 12; // TODO: Initialize to an appropriate value
		double expected = 4; // TODO: Initialize to an appropriate value
		double actual;
		actual = target.div(a1, a2);
		Assert.assertEquals(expected, actual);
		// throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false, groups = "group2")
	public void ignoreTest() {
		System.out.println("Ignore test");
	}

	@Test(timeOut = 1000, groups = "group2")
	public void infinity() {
		while (true) {
		}
	}

	@Test(groups = "group2")
	@Parameters(value = "p")
	public void parameter(int p) {
		System.out.println("Parameter = " + p);
	}

	@Parameters({ "param1", "param2" })
	@Test(groups = "group2")
	public void paramTest(int p1, String p2) {
		System.out.println("Parameter Example: Data(" + p1 + ", " + p2 + ")");
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { 5, "five" }, { 6, "six" } };
	}

	@Test(dataProvider = "getData", groups = "group2")
	public void instanceDbProvider(int p1, String p2) {
		System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
	}

	/**
	 * The “method2( )” will execute only if “method1( )” is run successfully,
	 * else “method2( )” will skip
	 */
	@Test(groups = "group2")
	public void method1() {
		System.out.println("This is method 1");
		//Assert.fail();
	}

	@Test(dependsOnMethods = { "method1" }, groups = "group2")
	public void method2() {
		System.out.println("This is method 2");
	}
}
