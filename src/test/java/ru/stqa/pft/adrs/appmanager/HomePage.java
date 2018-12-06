package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends HelperBase {

    public HomePage(WebDriver wd) {

        super(wd);
    }

    public void criteriaSearch(){
        type(By.cssSelector("body > div.ng-scope > div > div > div > div > div > div > div.flex-full-width-block > div > div > div.navbar-collapse.collapse.navbar-warning-collapse > form > div > input"), "0001239745");
    }

    public void search(){
        click(By.cssSelector("#go"));
    }


}