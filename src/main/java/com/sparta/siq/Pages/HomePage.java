package com.sparta.siq.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private final String homePageURL = "https://www.toolsqa.com/";

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage goToHomePage()
    {
        driver.navigate().to(homePageURL);
        return this;
    }


}
