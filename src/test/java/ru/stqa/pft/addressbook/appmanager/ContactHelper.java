package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(ContactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }
    public void returnToHomePage() {
        click(By.linkText("home"));
    }

    public void initContactModification() {
        click(By.cssSelector(".odd > .center:nth-child(8) img"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }
}
