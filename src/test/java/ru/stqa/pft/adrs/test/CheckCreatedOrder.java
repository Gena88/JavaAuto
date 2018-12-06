package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;
import ru.stqa.pft.adrs.appmanager.Navigation;


@Test
public class CheckCreatedOrder extends TestBase {

    public void testCheckCreatedOrder(){

        //Предусловие
        app.getNavigation().gotoHomePage();
        app.getNavigation().gotoNewOrder();
        app.getFoodOrders().createFoodOrders();
        app.getNavigation().gotoMakingOrder();
        app.getMakingOrders().createFinishOrders();

        //Тест
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
