package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation extends HelperBase {


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

    public void ss() {
        try {

            Thread.sleep(3000);     //1000-задержка  на 1000 миллисекунду = 1 секунда

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
