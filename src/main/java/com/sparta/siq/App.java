package com.sparta.siq;

import org.openqa.selenium.chrome.ChromeDriver;

public class App
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SIqbal\\Documents\\chromedriver_win32\\chromedriver.exe");
        ToolSQAWebsite toolSQAWebsite = new ToolSQAWebsite(new ChromeDriver());
        toolSQAWebsite.practiceFormPage().goToPracticeFormPage().PartialLinkText();



    }
}
