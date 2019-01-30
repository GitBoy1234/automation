package com.qa.gbpp.pages;

import com.qa.gbpp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class iFrames  {



    public void getUrl(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/rikac/OneDrive/Documents/myFrames.html");
        driver.switchTo().frame("selenium");
        driver.findElement(By.id("ctl00_btnBenefits")).click();



        try {

            driver.findElement(By.id("ctl00_btnForms")).click();
        }

        catch (Exception e){

            e.printStackTrace();
        }





    }
}
