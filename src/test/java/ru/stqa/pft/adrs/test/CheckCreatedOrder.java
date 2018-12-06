package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;
import ru.stqa.pft.adrs.appmanager.Navigation;


@Test
public class CheckCreatedOrder extends TestBase {

    public void testCheckCreatedOrder(){

        app.getNavigation().gotoHomePage();
        app.getNavigation().gotoNewOrder();
        app.getNavigation().ss();
        app.getFoodOrders().selectWOK();
        app.getNavigation().ss();
        app.getFoodOrders().choiceUdonWithBeef_normal();
        app.getFoodOrders().selectDrinks_NonAlcoholic();
        app.getFoodOrders().choiceFruitJuice();
        app.getFoodOrders().addItemFood();

        app.getNavigation().gotoMakingOrder();
        app.getMakingOrders().filingPhoneClient();
        app.getNavigation().ss();
        app.getMakingOrders().filingNameClient();
        app.getMakingOrders().filingAdressClient();
        app.getMakingOrders().paymentMethod();
        app.getNavigation().ss();
        app.getMakingOrders().clickCookButton();
        app.getMakingOrders().clickCookButton();

        app.getHomePage().criteriaSearch();
        app.getHomePage().search();
//        ** Проверка:
//        *** Нашелся заказ с параметрами:
//        **** Статус - на кухне
//        **** Филиал - Новокузнецкий
//        **** Адрес - Россия, Москва, ул Пятницкая, д 24
//        **** Клиент - Клиент: Тестов Тест  +7 (000) 1239745
//        **** Сумма: 825 р.

    }

}
