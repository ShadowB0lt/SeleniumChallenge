package com.sparta.siq.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

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
    private final By experienceName = By.name("exp");

    private List<String> genderList;
    private List<String> experienceList;

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
        return driver.findElement(By.id("content")).isDisplayed();
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

    public List<String> getGenderElements()
    {
        //ArrayList for storing radiobutton values
        genderList = new ArrayList<>();

        //For loop, iterates every input value of radio buttons based on name of input
        for(WebElement genderElements : driver.findElements(genderName))
        {
            //discovered value in input radio button is added to the arraylist.
            genderList.add(genderElements.getAttribute("value"));
        }
        //System.out.println(genderList);
        return genderList;
    }

    public void selectGender(String genderValue)
    {

        //Check if List for genders is empty
        if(genderList == null)
        {
            //if list is empty get a populated list and assign to list
            genderList = getGenderElements();
        }
        //Choose a correct gender value from within arraylist of values
        if(genderList.contains(genderValue))
        {
            //Select the radio button based on the index that matches the chosen value.
            driver.findElement(By.id("sex-"+ genderList.indexOf(genderValue))).click();
        }
        else {
            throw new IllegalArgumentException("The requested Element was not avaliable. Please use one of the following " + genderList);
        }

    }

    public boolean getSelectedGenderRadioButton(String genderValue)
    {
        if (genderList == null)
        {
            getGenderElements();
        }
        if(genderList.contains(genderValue))
        {
            return findElement(By.id("sex-"+genderList.indexOf(genderValue))).isSelected();
        }
        else
        {
            return false;
        }
    }

public List<String> getYearsofExperienceElements()
{
    experienceList = new ArrayList<>();

    for(WebElement experienceElement : driver.findElements(experienceName))
    {
        experienceList.add(experienceElement.getAttribute("value"));
    }

    return experienceList;
}

public void selectExperienceButton(String expValue)
{
    if(experienceList == null)
    {
        experienceList = getYearsofExperienceElements();
    }
    if(experienceList.contains(expValue))
    {
        driver.findElement(By.id("exp-"+experienceList.indexOf(expValue))).click();
    }
    else {
        throw new IllegalArgumentException("The requested Element was not avaliable. Please use one of the following " + experienceList);
    }

}

public boolean getSelectedExperienceButton(String expValue)
{

    if(experienceList == null)
    {
        experienceList = getYearsofExperienceElements();
    }
    if(experienceList.contains(expValue))
    {
        return driver.findElement(By.id("exp-"+experienceList.indexOf(expValue))).isSelected();
    }
    else
    {
        return false;
    }
}
















}
