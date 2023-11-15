package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        goToGroupPage();
        selectGroup();
        deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }

    public void goToGroupPage () {
        app.getGroupHelper().driver.findElement(By.linkText("groups")).click();
    }
    private void selectGroup() {
        app.getGroupHelper().driver.findElement(By.name("selected[]")).click();
    }
    private void deleteSelectedGroup() {
        app.getGroupHelper().driver.findElement(By.cssSelector("input[name='delete']")).click(); //By.cssSelector("input[name='delete']")

    }
}
