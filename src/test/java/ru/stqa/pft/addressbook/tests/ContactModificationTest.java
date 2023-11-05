package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

@Test
    public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getNavigationHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData(("test_name","test_surname",null),false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();
}
}
