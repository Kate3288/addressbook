package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class HelperBase {
    public WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;

    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = driver.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }
        return false;
    }

            public boolean isAlertPresent() {
                try {
                    driver.switchTo().alert();
                    return true;
                } catch (NoAlertPresentException e) {
                    return false;
                }
            }

    public void initContactCreation() {
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException) {
           return false;
        }
    }
}

