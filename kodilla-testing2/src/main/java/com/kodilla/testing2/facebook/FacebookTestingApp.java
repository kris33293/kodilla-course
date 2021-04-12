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
    public static final String XPATH_FIRST_NAME = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input";
    public static final String XPATH_LAST_NAME = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input";
    public static final String XPATH_EMAIL = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input";
    public static final String XPATH_DAY_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
    public static final String XPATH_MONTH_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String XPATH_YEAR_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");


        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();

        while (!driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).isDisplayed());
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        Thread.sleep(5000);
        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRST_NAME));
        firstnameField.sendKeys("Firstname");


        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LAST_NAME));
        lastnameField.sendKeys("Lastname");

        WebElement emailField = driver.findElement(By.xpath(XPATH_EMAIL));
        emailField.sendKeys("test@test.ie");

        WebElement mobField = driver.findElement(By.xpath(XPATH_MONTH_OF_BIRTH));
        Select mobSelect = new Select(mobField);
        mobSelect.selectByIndex(12);

        WebElement dobField = driver.findElement(By.xpath(XPATH_DAY_OF_BIRTH));
        Select dobSelect = new Select(dobField);
        dobSelect.selectByIndex(27);

        WebElement yobField = driver.findElement(By.xpath(XPATH_YEAR_OF_BIRTH));
        Select yobSelect = new Select(yobField);
        yobSelect.selectByIndex(29);





    }
}
