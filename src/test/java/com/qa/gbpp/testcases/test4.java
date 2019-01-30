package com.qa.gbpp.testcases;

import com.qa.gbpp.base.TestBase;
import com.qa.gbpp.pages.CheckLinks;
import com.qa.gbpp.pages.iFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class test4 extends TestBase {

    CheckLinks cl = new CheckLinks();

    public test4() {

        super();
    }


    @BeforeTest
    public void setUp() {
        initialize();
        cl = new CheckLinks();


    }




    @Test(enabled = true)
    void checkLinks() {

        List<WebElement> link = driver.findElements(By.tagName("a"));

        System.out.println(link.size());

        for (WebElement ele : link) {
            //System.out.println(ele.getAttribute("href"));
            String url = ele.getAttribute("href");

            cl.VerifyLinks(url);


        }

    }

}

