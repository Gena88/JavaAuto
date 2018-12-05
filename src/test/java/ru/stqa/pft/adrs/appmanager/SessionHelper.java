package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver wd) {

        super(wd);
    }

    public void login(String username, String password) {
        type(By.id("inputLogin"), username);
        type(By.id("inputPassword"), password);
        click(By.xpath("/html/body/div[2]/div/div/div[2]/form/button"));
    }

    public void selectBranch() {
        new Select(wd.findElement(By.id("selectKitchen"))).selectByVisibleText("Новокузнецкий");
        click(By.xpath(".//*[@class=\"btn btn-lg btn-default btn-block\"]"));
    }
}
