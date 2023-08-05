package org.devops.sampleTests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test
    public void sampleTest1() {
        int a = 4, b = 7;
        int sum = a + b;
        System.out.println("Executing First Sample Method");
        Assert.assertEquals(sum, 11, "Addition test Failed");
    }

    @Test
    public void sampleTest2() {
        int a = 4, b = 7;
        int res = b - a;
        System.out.println("Executing Second Sample Test");
        Assert.assertEquals(res, 3, "Subtraction test Failed");
    }

    @Test
    public void sampleTest3() {
        int a = 4, b = 7;
        int res = b * a;
        System.out.println("Executing Third Sample Method");
        Assert.assertEquals(res, 28, "Multiple Method Failed");
    }
}