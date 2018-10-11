package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;

import org.openqa.selenium.*;
import ru.stqa.pft.adrs.model.ContactDate;

public class ContactCreate extends TestBase {


    @Test
    public void ContactCreate() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactDate("test2", "test2"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();
    }




}
