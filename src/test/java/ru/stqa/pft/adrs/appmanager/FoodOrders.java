package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FoodOrders extends HelperBase {


    public FoodOrders(WebDriver wd) {

        super(wd);
    }

    //Выбор категории: WOK
    public void wok() {
//        click(By.cssSelector(".text-selected"));
//        click(By.xpath("//a[.=\"WOK\"]"));
//        click(By.cssSelector("a[href = \"#\"]"));
//        click(By.cssSelector("#oper-top > div.col-md-3 > div > div > div > ng-include > div > div > div > div:nth-child(1) > div.child > a"));
//        click(By.xpath(".//*[@class=\"item-header ng-binding\"]"));
//        click(By.xpath("//a[contains(.,\"WOK\")]"));
//        click(By.xpath("//*[@id=\"oper-top\"]/div[1]/div/div/div/ng-include/div/div/div/div[1]/div[1]/a"));
        wd.findElement(By.xpath("//*[@id=\"oper-top\"]/div[1]/div/div/div/ng-include/div/div/div/div[1]/div[1]/a")).click();

    }


    //Добавить в заказ: Удон Говяжий (нормальный)
    public void udonWithBeef_normal() {
            click(By.cssSelector("div.panel-warning:nth-child(1) > div:nth-child(2) > button:nth-child(1)"));
//            click(By.cssSelector("button[]"));
//        click(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/ui-view/div[1]/div[2]/div/div/div/ng-include/div[1]/div[2]/button[1]"));
    }


    //Выбор категории: Напитки --> Безалкогольные
    public void drinks_NonAlcoholic() {
//        wd.findElement(By.xpath(".//*[@class=\"item-header ng-binding text-selected\"]")).click();
//        click(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/ui-view/div[1]/div[1]/div/div/div/ng-include/div/div/div/div[7]/div[2]/div[1]/div[1]/a"));
        click(By.cssSelector("#oper-top > div.col-md-3 > div > div > div > ng-include > div > div > div > div:nth-child(7) > div.list-group > div:nth-child(1)"));
    }


    //Добавить в заказ: Морс Ягодный
    public void fruitJuice() {
        click(By.cssSelector("div.col-md-3:nth-child(30) > div:nth-child(2) > button:nth-child(1)"));
    }


    //Добавить позицию в заказ (В ДАННОМ СЛУЧАЕ МОРС ЯГОДНЫй)
    public void addItemFood() {
        click(By.cssSelector(".tbody > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(3)"));
    }


//    number1 = wd.findElement(By.cssSelector("/html/body/div[2]/div/div/div/div/div/div/div/ui-view/div[2]/div/ng-include/div/div[2]/div[1]/div/div[1]/span"));


    public void create() {
        paused();
        wok();
        paused();
        udonWithBeef_normal();
        drinks_NonAlcoholic();
        fruitJuice();
        addItemFood();
    }

}

