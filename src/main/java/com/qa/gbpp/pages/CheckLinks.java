package com.qa.gbpp.pages;

import com.qa.gbpp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CheckLinks extends TestBase {

    //RegisterNewUser ru = new RegisterNewUser();

    public void VerifyLinks(String linkUrl) {

        try {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();

            if (httpURLConnect.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
                System.out.println
                        (linkUrl + " - " + httpURLConnect.getResponseMessage() + "- " + HttpURLConnection.HTTP_NOT_FOUND);
            }

        } catch (MalformedURLException mfue) {

            mfue.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();


        }


//
    }

}



