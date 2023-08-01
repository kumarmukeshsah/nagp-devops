package org.devops.sampleTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        int a= 4, b=7;
        int sum = a+b;
        Assert.assertEquals(sum,11,"Addition test");
    }

    @Test
    public void test2(){
        int a= 4, b=7;
        int res = b-a;
        Assert.assertEquals(res,3,"Subtraction test");
    }

    @Test
    public void test3(){
        int a= 4, b=7;
        int res = b*a;
        Assert.assertEquals(res,28,"Multiple test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
}
