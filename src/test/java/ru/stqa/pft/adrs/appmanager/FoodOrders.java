package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adrs.model.ContactDate;

public class FoodOrders extends HelperBase {
    private WebDriver wd;

    public FoodOrders(WebDriver wd) {

        super(wd);
    }




    /*
    public void submitContactCreation() {

        click(By.name("submit"));
    }

    //Вспомагательный метод к неработающему тесту!!!
    public void submintContact() {

        click(By.name("update"));
    }

    //Вспомагательный метод к неработающему тесту!!!
    public void initContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[7]/a/img"));

    }

    //Вспомагательный метод к неработающему тесту!!!
    public void selectContact() {
        click(By.id("id2"));

    }
    */

}

