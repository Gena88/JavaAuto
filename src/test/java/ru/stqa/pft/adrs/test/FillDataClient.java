package ru.stqa.pft.adrs.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FillDataClient extends TestBase {

    @BeforeMethod
    public void ensurePrecoding(){
        //Формирование заказа
        app.goTo().homePage();
        app.goTo().newOrder();
        app.foodOrders().create();
    }


    @Test
    public void testFillDataClient(){

        //Заполнение данных о клиенте
        app.goTo().gotoMakingOrder();
        app.makingOrders().phoneClient();
        app.goTo().pause();
        app.makingOrders().nameClient();
        app.makingOrders().adressClient();
        app.makingOrders().paymentMethod();
        app.goTo().pause();
        app.makingOrders().cookButton();
//        * Проверка автоматически заполненных полей:
//        ** Название филиала - Новокузнецкий
//        ** Источник заказа - Телефон
//        ** Сдача с - 900
//        ** К оплате - 825,00 р.

//        ** Проверка:
//        *** Вернулись на страницу /operator/all

    }
}
