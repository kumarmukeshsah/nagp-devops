package org.devops.frontendTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.devops.utility.GetProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleUITest {
    WebDriver driver;
    GetProperties getProperties = new GetProperties();
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(getProperties.readProperties("url"));
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        Assert.assertEquals(driver.getTitle(),"Nagarro | Digital Product Engineering & Technology Consulting | Thinking Breakthroughs","Title Mismatched");
    }

    @Test
    public void test2(){
        System.out.println("Test");
    }

    @Test
    public void test3(){
        System.out.println("Test");
    }


    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
