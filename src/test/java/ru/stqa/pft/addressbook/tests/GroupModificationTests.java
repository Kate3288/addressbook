package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{

    @Test

    public void testGroupModification () {

        app.getGroupHelper().driver.findElement(By.linkText("group page")).click();
        app.getGroupHelper().driver.findElement(By.name("selected[]")).click();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().submitgroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}

