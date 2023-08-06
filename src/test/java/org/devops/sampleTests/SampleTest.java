package org.devops.sampleTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test
    public void sampleUITest(){
        driver = new FirefoxDriver();
        driver.get("http://google.in");
        Assert.assertEquals(driver.getTitle(), "Goog","Title Mismatched");
        System.out.println("Assertion Passed expected title Matched with Actual");
    }

    @Test
    public void sampleTest1() {
        int a = 4, b = 7;
        int sum = a + b;
        System.out.println("Executing First Sample Method");
        Assert.assertEquals(sum, 10, "Addition test Failed");
        System.out.println("Addition test Assertion Passed");
    }

    @Test
    public void sampleTest2() {
        int a = 4, b = 7;
        int res = b - a;
        System.out.println("Executing Second Sample Test");
        Assert.assertEquals(res, 3, "Subtraction test Failed");
        System.out.println("Subtraction test Assertion Passed");
    }

    @Test
    public void sampleTest3() {
        int a = 4, b = 7;
        int res = b * a;
        System.out.println("Executing Third Sample Method");
        Assert.assertEquals(res, 2, "Multiplication Method Failed");
        System.out.println("Multiplication test Assertion Passed");
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
        System.out.println("Executing Tear Down Driver closed");
    }
}