package com.sparta.siq;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFormPageTest {

    private static ToolSQAWebsite toolSQAWebsite;

    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SIqbal\\Documents\\chromedriver_win32\\chromedriver.exe");
        toolSQAWebsite = new ToolSQAWebsite(new ChromeDriver());
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

    //@Test
    //public


}
