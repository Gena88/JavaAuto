package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;


public class AddFoodOrders extends TestBase {

     @Test
    public void testAddFoodOrders(){
        //Формирование заказа
        app.goTo().homePage();
        app.goTo().newOrder();
        app.goTo().pause();
        app.foodOrders().wok();
        app.goTo().pause();
        app.foodOrders().udonWithBeef_normal();
//        ** Проверка:
//        *** Блюдо добавлено в нижнюю таблицу:
//         MatcherAssert
//        **** № - 1
//        Assert.assertTrue(app.foodOrders().assertElementText());
//        **** Блюдо -  Удон с говядиной Ньюпай Обычный
//        **** Есть кнопка "+" перед названием блюда
//        **** Кол-во блюд - 1
//        **** Комментарий - Добавить комментарий
//        **** Цена - 385 р.
//        **** Скидка - 0 р.
//        **** Стоимость - 385 р.
        app.foodOrders().drinks_NonAlcoholic();
        app.foodOrders().fruitJuice();
        app.foodOrders().addItemFood();
//        ** Проверка:
//        *** Блюдо "Морс ягодный" в нижней таблице:
//        **** № - 2
//        **** Блюдо -  Морс ягодный
//        **** Нет кнопки "+" перед названием блюда
//        **** Кол-во блюд - 2
//        **** Комментарий - Добавить комментарий
//        **** Цена - 220 р.
//        **** Скидка - 0 р.
//        **** Стоимость - 440 р.
//        *** К оплате: 825,00
    }
}