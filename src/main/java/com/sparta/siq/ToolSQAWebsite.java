package com.sparta.siq;

import com.sparta.siq.Pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;

public class ToolSQAWebsite {


    private final WebDriver driver;

    public ToolSQAWebsite(WebDriver driver)
    {
        this.driver = driver;
    }

    public PracticeFormPage practiceFormPage()
    {
        return new PracticeFormPage(driver);
    }


}
