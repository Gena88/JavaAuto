package ru.stqa.pft.adrs.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.adrs.model.ContactDate;
import ru.stqa.pft.adrs.test.TestBase;

import static org.openqa.selenium.OutputType.*;

public class ContactModification extends TestBase {

    

    @Test
    public void ContactModification() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContact();
        app.getContactHelper().fillContactForm(new ContactDate("Привет", "Приветулив"));
        app.getContactHelper().submintContact();
        app.getNavigationHelper().gotoHomePage();
    }




}
