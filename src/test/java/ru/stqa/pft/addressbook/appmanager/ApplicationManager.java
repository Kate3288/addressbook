package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;


public class ApplicationManager {
    public WebDriver driver;
    private  NavigationHelper navigationHelper;
    public GroupHelper groupHelper;
    JavascriptExecutor js;


    private SessionHelper sessionHelper;

public void init() {
    Browser BrowserType = null;
    String browser = String.valueOf(BrowserType.CHROME);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    groupHelper = new GroupHelper(driver);
}


    public void stop() {
        driver.quit();
    }
    public void authentication() {
        driver.get("http://localhost/addressbook/index.php");
        sessionHelper.login("admin", "secret");
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }



    public void login(String username, String password) {
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    public ContactHelper getContactHelper() {
        return new ContactHelper(driver);
    }
}
