package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;
import ru.stqa.pft.adrs.appmanager.Navigation;


@Test
public class FillDataClient extends TestBase {

    public void testFillDataClient(){

        app.getNavigation().gotoHomePage();
        app.getNavigation().gotoNewOrder();
        app.getNavigation().ss();
        app.getFoodOrders().selectWOK();
        app.getNavigation().ss();
        app.getFoodOrders().choiceUdonWithBeef_normal();
        app.getFoodOrders().selectDrinks_NonAlcoholic();
        app.getFoodOrders().choiceFruitJuice();
        app.getFoodOrders().addItemFood();

        
//        -Заполнение данных о клиенте-
        app.getNavigation().gotoMakingOrder();
//        * Заполнить поля:
//        ** Телефон - 0001239745
//        ** Имя клиента - Тестов Тест
//        ** Адрес (улица, дом) - Пятницкая улица, 24
//        ** Вид оплаты - Наличные
//        * Проверка автоматически заполненных полей:
//        ** Название филиала - Новокузнецкий
//        ** Источник заказа - Телефон
//        ** Сдача с - 900
//        ** К оплате - 825,00 р.
//        * Нажать кнопку "Готовить!"
//        ** Проверка:
//        *** Вернулись на страницу /operator/all

    }
}
