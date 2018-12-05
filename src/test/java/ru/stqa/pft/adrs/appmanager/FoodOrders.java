package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adrs.model.ContactDate;

public class FoodOrders extends HelperBase {
    private WebDriver wd;

    public FoodOrders(WebDriver wd) {

        super(wd);
    }

    //Выбор категории: WOK
    public void selectWOK() {

        wd.findElement(By.xpath(".//*[@class=\"item-header ng-binding\"]")).click();
    }


    //Добавить в заказ: Удон Говяжий (нормальный)
    public void choiceUdonWithBeef_normal() {

        wd.findElement(By.cssSelector("div.panel-warning:nth-child(1) > div:nth-child(2) > button:nth-child(1)")).click();
    }


    //Выбор категории: Напитки --> Безалкогольные
    public void selectDrinks_NonAlcoholic() {

//        wd.findElement(By.xpath(".//*[@class=\"item-header ng-binding text-selected\"]")).click();
        wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/ui-view/div[1]/div[1]/div/div/div/ng-include/div/div/div/div[7]/div[2]/div[1]/div[1]/a")).click();
    }


    //Добавить в заказ: Морс Ягодный
    public void choiceFruitJuice() {

        wd.findElement(By.cssSelector("div.col-md-3:nth-child(30) > div:nth-child(2) > button:nth-child(1)")).click();
    }

    
    //Добавить позицию в заказ (В ДАННОМ СЛУЧАЕ МОРС ЯГОДНЫй)
    public void addItemFood() {

        wd.findElement(By.cssSelector(".tbody > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > button:nth-child(3)")).click();
    }

}

