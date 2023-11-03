package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().driver.findElement(By.name("selected[]")).click();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Test 1", "Test 2", "Test 3"));
        app.getGroupHelper().submitgroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}

