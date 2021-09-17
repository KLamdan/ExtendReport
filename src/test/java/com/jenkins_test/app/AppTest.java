package com.jenkins_test.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver webdriver;
    private static final String MainPage = "https://www.google.com/";
    public AppTest(){
        webdriver = new FirefoxDriver();
    }

   @BeforeSuite
   private void chekDriver(){
       assertNotNull(webdriver);
   }
   @BeforeTest
   public void loadMainPage() { webdriver.get(AppTest.MainPage); }

    @Test
    public void first(){
        assertEquals(webdriver.getCurrentUrl(), AppTest.MainPage); }

    @AfterSuite
    public void closeDriver(){ webdriver.quit(); }

}
