package org.devops.sampleTests;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
        Proxy proxy = new Proxy();
        proxy.setAutodetect(false);
        proxy.setNoProxy("no_proxy-var");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("proxy", proxy);
        driver = new FirefoxDriver(firefoxOptions);
        driver.get("http://google.in");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle,"Title Mismatched");
        System.out.println("Assertion Passed expected title:  " + expectedTitle + "Matched with Actual: "+ actualTitle);
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

    @AfterTest
    public void tearDown()
    {
        driver.close();
    }
}