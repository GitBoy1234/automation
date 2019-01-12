//package com.qa.gbpp.testcases;
//
//import com.qa.gbpp.utils.Utilities;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class test {
//
//    WebDriver driver;
//
//   @BeforeTest
//    public void setUp(){
//
//        System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver.exe");
//        driver = new ChromeDriver();
//
//
//    }
//
//    @Test
//    public void getUrl(){
//       driver.navigate().to("https://www.uat.e-tshwane.co.za/");
//       //driver.get("https://www.uat.e-tshwane.co.za/");
//      // driver.manage().timeouts().(20,TimeUnit.SECONDS);
//       WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Payment')]"));
//       System.out.println(gmail.getText());
//       gmail.click();
//        WebDriver.Navigation navigate = driver.navigate();
//        navigate.back();
//        navigate.forward();
//        navigate.refresh();
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        WebElement gmail1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Payment')]")));
//        gmail1.click();
//
//
//    }
//}
