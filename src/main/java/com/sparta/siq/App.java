package com.sparta.siq;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App
{
    public static void main( String[] args )
    {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\SIqbal\\Documents\\chromedriver_win32\\chromedriver.exe");
        //ToolSQAWebsite toolSQAWebsite = new ToolSQAWebsite(new ChromeDriver());
        //toolSQAWebsite.practiceFormPage().goToPracticeFormPage().PartialLinkText();


        System.setProperty("webdriver.gecko.driver","resources/geckodriver");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        ToolSQAWebsite toolSQAWebsite = new ToolSQAWebsite(new FirefoxDriver());
        toolSQAWebsite.practiceFormPage().goToPracticeFormPage().getGenderElements();

    }
}
