package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adrs.model.ContactDate;

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

    public void submintContact() {
        click(By.name("update"));
    }

    public void initContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[7]/a/img"));

    }

    public void selectContact() {
        click(By.id("id2"));

    }

}

