package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation extends HelperBase {


    public Navigation(WebDriver wd) {
        super (wd);
    }

    //Переход на стартовую страницу (operator/all)
    public void homePage() {
        wd.get("http://93.158.194.208:6005/operator/all");
    }

    //Переход по кнопки к формированию нового заказа
    public void newOrder() {
//        wd.findElement(By.xpath(".//*[@class=\"navbar-brand nav-button\"]")).click();
//        wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/a")).click();
//        wd.findElement(By.cssSelector("a.nav-button")).click();
        click(By.cssSelector("a[href = \"/operator/new/products\"]"));
//        wd.findElement(By.xpath("//a[.= \"Новый заказ\"]"));
    }

    //Переход к завершению оформления заказа
    public void gotoMakingOrder() {
//        wd.findElement(By.xpath(".//*[@class=\"navbar-brand nav-button\"]")).click();
//        wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/a")).click();
//        wd.findElement(By.cssSelector("a.nav-button")).click();
        click(By.cssSelector("a[href = \"/operator/new/order\"]"));
//        wd.findElement(By.xpath("//a[.= \"Новый заказ\"]"));
    }

    public void pause() {
        try {

            Thread.sleep(2500);     //1000-задержка  на 1000 миллисекунду = 1 секунда

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
