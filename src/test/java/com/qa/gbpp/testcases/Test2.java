package com.qa.gbpp.testcases;

import com.qa.gbpp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 extends TestBase {

    public Test2() {

        super();
    }

    @BeforeSuite (groups = {"loginIntoApp"})
    public void setUp() {
        initialize();
    }

    @Test (groups = {"loginIntoApp"})
    public void testname(){

        driver.findElement(By.xpath("//a[contains(text(),'Lodge a Complaint')]")).click();



    }

    @Test(dependsOnMethods = {"testname"},groups = {"loginIntoApp"})
    public void testClick(){

        driver.findElement(By.xpath("//a[contains(text(),'click here')]")).click();

    }

    @Test(dependsOnGroups = {"loginIntoApp"}, groups = {"Checkbox"})
    public void checkTandC(){

        driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
    }
    @Parameters({"username","initials","name","surname","idNumber"})
    @Test(dependsOnMethods = {"checkTandC"},groups = {"Checkbox"})
    //@Parameters({"username","initials","name","surname","idNumber"})
    public void register(String username,String initials,String name, String surname,String idNumber) {
        WebElement drpdown1 = driver.findElement
                (By.id("regContainerRow:regContainerColumn:regCustomContent:reg:regIndiv:j_idt81:selectTitle:selectTitle_label"));

        Select sldropdown = new Select(drpdown1);
        driver.findElement(By.xpath("//input[contains(@id,':txtUsername:inputText')]")).sendKeys(username);
        sldropdown.selectByVisibleText("Mr");
        driver.findElement(By.xpath("//input[contains(@id,':txtInitials:inputText')]")).sendKeys(initials);
        driver.findElement(By.xpath("//input[contains(@id,':txtName:inputText')]")).sendKeys(name);
        driver.findElement(By.xpath("//input[contains(@id,':txtSurname:inputText')]")).sendKeys(surname);
        Select sldropdown1 =
                new Select(driver.findElement(By.xpath
                        ("//div[contains(@id,':selectIdType:selectIdType')]" +
                                "//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")));

        sldropdown1.selectByVisibleText("South African ID");
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement idBox =
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
                        ("//input[contains(@id,':txtIDParent:txtIdNumber:inputText')]")));
        idBox.sendKeys(idNumber);


    }







}