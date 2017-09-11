package com.softserve.edu;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.*;

public class ConcurrencyTest {
    private Map<String, String> data;
    
    @BeforeClass
    void setUp() throws Exception {
        data = new HashMap<String, String>();
    }
    @AfterClass
    void tearDown() throws Exception {
        data = null;
    }

    @Test(threadPoolSize = 2, invocationCount = 2, invocationTimeOut = 10000)
    public void testMapOperations() throws Exception {
        data.put("1", "111");
        data.put("2", "111");
        data.put("3", "111");
        data.put("4", "111");
        data.put("5", "111");
        data.put("6", "111");
        data.put("7", "111");
        for (Map.Entry<String, String> entry : data.entrySet()) {
        	System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
            System.out.println(entry);
        }
        //data.clear();
    }

    @Test(singleThreaded = true, // run in a single thread
    invocationCount = 5, invocationTimeOut = 10000)
    public void testMapOperationsSafe() throws Exception {
        data.put("1", "111");
        data.put("2", "111");
        data.put("3", "111");
        data.put("4", "111");
        data.put("5", "111");
        data.put("6", "111");
        data.put("7", "111");
        for (Map.Entry<String, String> entry : data.entrySet()) {
        	System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
            System.out.println(entry);
        }
        data.clear();
    }
}
