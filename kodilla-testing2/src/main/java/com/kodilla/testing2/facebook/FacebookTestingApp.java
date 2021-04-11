package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//button[2]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_FIRST_NAME = "class=inputtext _58mg _5dba _2ph-";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");


        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();

        while (!driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).isDisplayed());
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        while (!driver.findElement(By.id("firstname")).isDisplayed());
        WebElement searchField = driver.findElement(By.id("firstname"));
        searchField.sendKeys("Firstname");




    }
}
