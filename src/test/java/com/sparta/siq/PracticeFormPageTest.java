package com.sparta.siq;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeFormPageTest {

    private static ToolSQAWebsite toolSQAWebsite;

    @BeforeClass
    public static void setup()
    {
        //Firefox setup for mac
        System.setProperty("webdriver.gecko.driver","resources/geckodriver");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        toolSQAWebsite = new ToolSQAWebsite(new FirefoxDriver());
        //Windows setup for chrome
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\SIqbal\\Documents\\chromedriver_win32\\chromedriver.exe");
        //toolSQAWebsite = new ToolSQAWebsite(new ChromeDriver());

        toolSQAWebsite.practiceFormPage().goToPracticeFormPage();
    }

    @Test
    public void PartialLinkTextTest()
    {
        String text = toolSQAWebsite.practiceFormPage().PartialLinkText();
        Assert.assertEquals(text,"Partial Link Test");

    }

    @Test
    public void PartialLinkDisplayedTest()
    {
        toolSQAWebsite.practiceFormPage().goToPracticeFormPage().isPartialLinkDisplayed();
    }

    @Test
    public void LinkClickTest()
    {
        boolean isDisplayed = toolSQAWebsite.practiceFormPage().goToPracticeFormPage().LinkTestClick().LinkTestPageDisplayed();
        Assert.assertEquals(isDisplayed,true);
    }

    @Test
    public void FirstTextField()
    {
        Assert.assertEquals("Hello",toolSQAWebsite.practiceFormPage().goToPracticeFormPage().inputFirstName("Hello").getFirstNameTextBox());
    }

    @Test
    public void LastTextField()
    {
        Assert.assertEquals("jb skj bgsf",toolSQAWebsite.practiceFormPage().goToPracticeFormPage().inputLastName("jb skj bgsf").getLastNameTextBox());
    }

    @Test
    public void GenderRadioButtonSize()
    {

        Assert.assertEquals(2,toolSQAWebsite.practiceFormPage().goToPracticeFormPage().getGenderElements().size());

    }

    @Test
    public void checkIfChosenRadioButtonIsSelected()
    {

        toolSQAWebsite.practiceFormPage().goToPracticeFormPage().selectGender("Female");
        Assert.assertTrue(toolSQAWebsite.practiceFormPage().getSelectedGenderRadioButton("Female"));
    }

    @Test
    public void checkChosenExperienceRadioButtonCheck()
    {
        toolSQAWebsite.practiceFormPage().selectExperienceButton("3");
        Assert.assertTrue(toolSQAWebsite.practiceFormPage().getSelectedExperienceButton("3"));
    }


    @AfterClass
    public static void teardown()
    {
        toolSQAWebsite.TimeWait(5);
        toolSQAWebsite.teardown();
    }


}
