package com.sparta.siq.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class PracticeFormPage {

    private WebDriver driver;
    private final String practiceFormURL ="https://www.toolsqa.com/automation-practice-form/";
    private final String partialLinkURL = "http://toolsqa.com/automation-practice-form/";
    private final By partialLinkTextID = By.className("control-group");
    private final By linkTestID = By.linkText("Link Test");
    private final String linkTestURL = "https://www.toolsqa.com/automation-practice-table/";
    private final By genderName = By.name("sex");
    private final By firstNameField = By.name("firstname");
    private final By lastNameField = By.name("lastname");
    //private final

    public PracticeFormPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public PracticeFormPage goToPracticeFormPage()
    {
        driver.navigate().to(practiceFormURL);
        return this;

    }
    public String PartialLinkText()
    {
        return driver.findElement(partialLinkTextID).getText();
    }

    public boolean isPartialLinkDisplayed()
    {
        return driver.findElement(partialLinkTextID).isDisplayed();
    }

    public PracticeFormPage LinkTestClick()
    {
        driver.findElement(linkTestID).click();
        return this;
    }


    public boolean LinkTestPageDisplayed()
    {
        return driver.findElement(linkTestID).isDisplayed();
    }


    private WebElement findElement(By element)
    {
        return driver.findElement(element);
    }

    public PracticeFormPage inputFirstName(String firstName)
    {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }
    public PracticeFormPage inputLastName(String lastName)
    {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public String getFirstNameTextBox()
    {
        return driver.findElement(firstNameField).getAttribute("value");
    }

    public String getLastNameTextBox()
    {
        return driver.findElement(lastNameField).getAttribute("value");
    }


    //Get
//    private void getSexElements()
//    {
//        //Arraylist for storing all radio button values
//        ArrayList<String> genderRadioElements = new ArrayList<>();
//
//
////        Add each value from form into Arraylist
//        for(WebElement genderElements : driver.findElement(genderName))
//        {
//
//        }
//    }




}
