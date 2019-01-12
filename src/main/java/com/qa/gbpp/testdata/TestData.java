
/*
* Author Navendrin Coopoosamy
* */



package com.qa.gbpp.testdata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class TestData {


    public ArrayList<String> urlListTestData =new ArrayList<String>();


    public  String userName;
    public  String passWord;
    public  String regUserName;
    public  String name;
    public  String initial;
    public  String surname;
    public  String idNumber;
    public  String emailAdress;
    public  String passResetLoginName;
    public  String passResetIdNum;
    public  String passResetEmailAdd;
    public  String accManagerUrl;
    public  String manageProfileUrl;
    public  String muniServiceUrl;
    public  String submitQueryUrl;
    public  String faqUrl;
    public  String investPortUrl;
    public  String appFormUrl;
    public  String emergServUrl;
    public  String homeUrl;
    public  String regSuccess;


    public   TestData()  {

        try {


            FileInputStream files = new FileInputStream(new File("D:\\testdata.xlsx"));
            XSSFWorkbook workBook = new XSSFWorkbook (files);
            XSSFSheet loginDetails = workBook.getSheetAt(0);
            XSSFSheet UserRegDetails = workBook.getSheetAt(1);
            XSSFSheet PasswordResetDetails = workBook.getSheetAt(2);
            XSSFSheet  IconUrls = workBook.getSheetAt(3);






            // login data
            userName = loginDetails.getRow(1).getCell(0).getStringCellValue();
            passWord = loginDetails.getRow(1).getCell(1).getStringCellValue();

            // user registration data
            regUserName = UserRegDetails.getRow(1).getCell(0).getStringCellValue();
            name = UserRegDetails.getRow(1).getCell(1).getStringCellValue();
            initial = UserRegDetails.getRow(1).getCell(2).getStringCellValue();
            surname = UserRegDetails.getRow(1).getCell(3).getStringCellValue();
            idNumber = UserRegDetails.getRow(1).getCell(4).getStringCellValue();
            emailAdress = UserRegDetails.getRow(1).getCell(5).getStringCellValue();

            //password reset data
            passResetLoginName = PasswordResetDetails.getRow(1).getCell(0).getStringCellValue();
            passResetIdNum = PasswordResetDetails.getRow(1).getCell(1).getStringCellValue();
            passResetEmailAdd = PasswordResetDetails.getRow(1).getCell(2).getStringCellValue();

            // urls
            accManagerUrl = IconUrls.getRow(1).getCell(0).getStringCellValue();
            muniServiceUrl = IconUrls.getRow(4).getCell(0).getStringCellValue();
            manageProfileUrl = IconUrls.getRow(7).getCell(0).getStringCellValue();
            submitQueryUrl = IconUrls.getRow(10).getCell(0).getStringCellValue();
            faqUrl = IconUrls.getRow(13).getCell(0).getStringCellValue();
            investPortUrl = IconUrls.getRow(16).getCell(0).getStringCellValue();
            appFormUrl = IconUrls.getRow(19).getCell(0).getStringCellValue();
            emergServUrl = IconUrls.getRow(22).getCell(0).getStringCellValue();
            homeUrl =  IconUrls.getRow(25).getCell(0).getStringCellValue();
            regSuccess = IconUrls.getRow(28).getCell(0).getStringCellValue();


            urlListTestData.add(accManagerUrl);
            urlListTestData.add(muniServiceUrl);
            urlListTestData.add(manageProfileUrl);
            urlListTestData.add(submitQueryUrl);
            urlListTestData.add(faqUrl);
            urlListTestData.add(investPortUrl);
            urlListTestData.add(appFormUrl);
            urlListTestData.add(emergServUrl);






        }
        catch (IOException ioe){
            ioe.printStackTrace();}




    }
}


