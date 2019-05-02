package com.sparta.siq;

import com.sparta.siq.Pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

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

    public void teardown()
    {
        driver.quit();

    }

    public void TimeWait(long time)
    {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

}
