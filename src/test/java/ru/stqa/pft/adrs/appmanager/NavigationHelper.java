package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        super (wd);
    }

    //Переход на страницу ГРУППЫ
    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    //Переход на страницу СОЗДАНИЯ КОНТАКТА
    public void gotoContactNew(){
        click(By.linkText("add new"));

    }

    //Возврат на ГЛАВНУЮ СТРАНИЦУ
    public void gotoHomePage(){
        click(By.linkText("home page"));

    }


}
