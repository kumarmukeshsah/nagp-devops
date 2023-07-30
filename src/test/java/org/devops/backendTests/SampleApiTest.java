package org.devops.backendTests;

import org.devops.utility.GetProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleApiTest {
    @BeforeTest
    public void beforeTest(){

    }

    @Test
    public void test1(){
        System.out.println("Test");
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
        System.out.println(" After Test");
    }
}
