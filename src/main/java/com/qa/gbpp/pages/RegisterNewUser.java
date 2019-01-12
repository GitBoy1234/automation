package com.qa.gbpp.pages;
import com.qa.gbpp.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.qa.gbpp.testdata.TestData;

import java.util.Set;


public class RegisterNewUser extends TestBase {

    String parentString;


    @FindBy(how = How.XPATH, using = "//li/a[@class='ui-menuitem-link ui-corner-all'][2]/span")
    WebElement wb;


    public RegisterNewUser() {
        PageFactory.initElements(driver, this);
    }

    public String checkUrl(){
         parentString = driver.getWindowHandle();
        //System.out.println(parentString);
        wb.click();
        Set<String> allWindows = driver.getWindowHandles();

        //System.out.println(allWindows.size());
         for(String child : allWindows){

             if (!child.equalsIgnoreCase(parentString)){

                 driver.switchTo().window(child);
                // System.out.println(driver.getCurrentUrl());




             }



         }



        return driver.getCurrentUrl();


    }

    public void switchBack(){

        driver.switchTo().window(parentString);
    }


}