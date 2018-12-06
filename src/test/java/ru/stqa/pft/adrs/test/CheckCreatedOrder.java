package ru.stqa.pft.adrs.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CheckCreatedOrder extends TestBase {

    @BeforeMethod
    public void ensurePrecoding(){
        app.goTo().homePage();
        app.goTo().newOrder();
        app.foodOrders().create();
        app.goTo().gotoMakingOrder();
        app.makingOrders().createFinishOrders();
    }


    @Test
    public void testCheckCreatedOrder(){

        app.homePage().criteriaSearch();
        app.homePage().goSearch();
//        ** Проверка:
//        *** Нашелся заказ с параметрами:
//        **** Статус - на кухне
//        **** Филиал - Новокузнецкий
//        **** Адрес - Россия, Москва, ул Пятницкая, д 24
//        **** Клиент - Клиент: Тестов Тест  +7 (000) 1239745
//        **** Сумма: 825 р.

    }

}
