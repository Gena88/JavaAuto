package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakingOrders extends HelperBase {

    public MakingOrders(WebDriver wd) {

        super(wd);
    }

    //Заполнение телефона клиента
    public void filingPhoneClient(){
        type(By.cssSelector("#phone"), "0001239745");
    }

    //Заполнение фамилии и имени клиента
    public void filingNameClient(){
        type(By.cssSelector("#name"), "Тестов Тест");
    }

    //Заполнение адреса клиента
    public void filingAdressClient(){
        if(wd.findElement(By.xpath("//i[3]")) != null) {
            click(By.cssSelector(".fa:nth-child(3)"));
            paused();
            click(By.cssSelector("button.btn.btn-success"));
            type(By.cssSelector("#inputAddress"), "Пятницкая улица, 24");
            paused();
            click(By.cssSelector("span.ng-binding.ng-scope"));
        } else {
            type(By.cssSelector("#inputAddress"), "Пятницкая улица, 24");
//            type(By.id("inputAddress"), "Пятницкая улица, 24");
            paused();
            click(By.cssSelector("span.ng-binding.ng-scope"));
        }
    }



    //Выбор метода оплаты: Наличными
    public void paymentMethod(){
       click(By.id("paymentTypeNew"));
       click(By.cssSelector("#paymentTypeNew > option.ng-binding.ng-scope"));
       click(By.cssSelector(".panel4 > div:nth-child(2)"));

    }

    //Нажать на кнопку "Готовить!"
    public void clickCookButton(){
        click(By.cssSelector(".btn-none-transition:nth-child(2)"));
    }

}
