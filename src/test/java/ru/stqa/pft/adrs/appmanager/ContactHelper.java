package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adrs.model.ContactDate;
import ru.stqa.pft.adrs.test.TestBase;

public class ContactHelper extends HelperBase {
    private WebDriver wd;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactDate contactDate) {
        type(By.name("firstname"), contactDate.getFirstname());
        type(By.name("lastname"), contactDate.getLastname());

    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

}

