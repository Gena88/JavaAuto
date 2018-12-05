package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.WebDriver;

public class Navigation extends HelperBase {
    private WebDriver wd;

    public Navigation(WebDriver wd) {
        super (wd);
    }

    //Переход на стартовую страницу (operator/all)
    public void gotoHomePage() {
        wd.get("http://93.158.194.208:6005/operator/all");
    }


   /*
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
    */

}
