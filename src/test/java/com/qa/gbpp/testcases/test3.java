package com.qa.gbpp.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test3 {


    @DataProvider
    public Object [][] getData(){

    Object [][] testdata = new Object[3][2];

    testdata[0][0] ="navendrin";
    testdata[0][1] = "coopoosamy";
    testdata[1][0] ="Rika";
    testdata[1][1] = "coopoosamy";
    testdata[2][0]  = "jesff";
    testdata[2][1]  = "blum";

    return testdata;


    }

    @Test(dataProvider = "getData" )
    public void testLogin(String logiName,String password){
        WebDriver driver ;
        System.setProperty
                ("webdriver.chrome.driver",("C:\\chromedriver.exe"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        driver.get("http://demosite.center/wordpress/wp-login.php");
        driver.findElement(By.id("user_login")).sendKeys(logiName);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("rememberme")).click();
        driver.findElement(By.id("wp-submit")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Welcome to Guru99');");












    }
}
