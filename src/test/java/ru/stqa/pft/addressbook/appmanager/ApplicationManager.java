package ru.stqa.pft.addressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class ApplicationManager {
    public WebDriver driver;
    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    JavascriptExecutor js;

    private SessionHelper SessionHelper;

    public void init() {
        groupHelper.driver = new ChromeDriver();
        js = (JavascriptExecutor) groupHelper.driver;
        Map<String, Object> vars = new HashMap<String, Object>();
        groupHelper = new GroupHelper(driver);
        NavigationHelper NavigationHelper = new NavigationHelper(driver);
        SessionHelper = new SessionHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    @Test
    public void testCase() {
        driver.get("http://localhost/addressbook/index.php");
        SessionHelper.login("admin", "secret");
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
}
