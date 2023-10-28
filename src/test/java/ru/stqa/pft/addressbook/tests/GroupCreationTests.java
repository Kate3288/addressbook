package ru.stqa.pft.addressbook.tests;

import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    public void testGroupCreation() {
        app.login("admin", "secret");
        app.goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test 1", "Test 2", "Test 3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
