package com.qa.gbpp.testcases;

import com.qa.gbpp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.gbpp.pages.CheckLinks;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Set;

public class Test1 extends TestBase {

    SoftAssert softAssert;

    CheckLinks cl;



    public Test1() {

        super();
    }

    @BeforeTest
    public void setUp() {
        initialize();
        cl = new CheckLinks();


    }

    @Test (priority =1)
    public void checkLinks() {

        List<WebElement> link = driver.findElements(By.tagName("a"));

        System.out.println(link.size());

        for (WebElement ele : link) {
            //System.out.println(ele.getAttribute("href"));
            String url = ele.getAttribute("href");

            cl.VerifyLinks(url);


        }
    }
        @Test(priority =2)
        public void switchTabs(){

             softAssert = new SoftAssert();


            WebElement urlToClick = driver.findElement(By.xpath("//li/a[@class='ui-menuitem-link ui-corner-all'][2]/span"));


           String parentTab =  driver.getWindowHandle();

            urlToClick.click();

           Set<String> Allwindows = driver.getWindowHandles();


           for (String childTab : Allwindows) {

               if (!parentTab.equalsIgnoreCase(childTab)) {

                   driver.switchTo().window(childTab);

               }
           }




                   softAssert.assertEquals("http://www.tshwane.gov.za/Pages/default.aspx",driver.getCurrentUrl());

                   softAssert.assertAll();

                   driver.switchTo().window(parentTab);


               }
























    @AfterTest
    public void tearDown(){

        driver.quit();



    }
}
