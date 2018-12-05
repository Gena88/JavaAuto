package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
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


    public void gotoNewOrder() {

//        wd.findElement(By.xpath(".//*[@class=\"navbar-brand nav-button\"]")).click();
//        wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/a")).click();
//        wd.findElement(By.cssSelector("a.nav-button")).click();
        wd.findElement(By.cssSelector("a[href = \"/operator/new/products\"]")).click();
//        wd.findElement(By.xpath("//a[.= \"Новый заказ\"]"));
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
