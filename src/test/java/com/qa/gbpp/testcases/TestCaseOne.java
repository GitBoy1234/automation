package com.qa.gbpp.testcases;

import com.qa.gbpp.base.TestBase;
import com.qa.gbpp.pages.RegisterNewUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
//import com.qa.gbpp.pages.CheckLinks;
//
//import java.util.List;
//
//
//public class TestCaseOne extends TestBase {
//    RegisterNewUser ru ;
//    CheckLinks  cl;
//    SoftAssert softAssert ;
//
//    public TestCaseOne(){
//
//        super();
//    }
//
//    @BeforeClass
//    public void setUp(){
//        initialize();
//        ru = new RegisterNewUser();
//        softAssert = new SoftAssert();
//    }
//
//    @Test (priority = 1)
//    public void checkTab(){
//
//
//        softAssert.assertTrue
//                   (ru.checkUrl().equalsIgnoreCase("http://www.tshwane.gov.za/Pages/default.aspx"));
//
//        softAssert.assertAll();
//
//        WebDriver.Navigation navigator = driver.navigate();
//        navigator.back();
//
//
//      }
//
////      @Test(priority = 2)
////    public void checkLinks() {
////
////
////          cl.checkLinks1();
////
////      }
//
////          ru.switchBack();
////        System.out.println(driver.getCurrentUrl());
////
////          List<WebElement> link = driver.findElements(By.tagName("a"));
////
////          System.out.println(link.size());
////
////          for (WebElement ele : link){
////              System.out.println(ele.getAttribute("href"));
////              String url = ele.getAttribute("href");
////
////          }
////
////
////
//
//
//
//
//
//
//
//
//      @AfterTest()
//    public void tearDown(){
//        driver.quit();
//
//      }
//
//    }
//
//
//
//
//
//
//
