package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.tracing.model.TracingBackend;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Test;


public class ApplicationManager {
    public WebDriver driver;
    private  NavigationHelper navigationHelper;
    public GroupHelper groupHelper;
    JavascriptExecutor js;


    private SessionHelper sessionHelper;

//    public void init() {
//        groupHelper.driver = new ChromeDriver();
//        js = (JavascriptExecutor) groupHelper.driver;
//        NavigationHelper navigationHelper = new NavigationHelper(driver);
//        sessionHelper = new SessionHelper(driver);
//
//
//    }
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

    public void goToGroupPage() {
        navigationHelper.goToGroupPage();
    }

    public void login(String username, String password) {
        driver.manage().window().setSize(new Dimension(1342, 868));
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    public ContactHelper getContactHelper() {
        return null;
    }
}
