package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;
import ru.stqa.pft.adrs.appmanager.Navigation;


@Test
public class AddFoodOrders extends TestBase {


    public void testAddFoodOrders(){
        app.getNavigation().gotoHomePage();
        app.getNavigation().gotoNewOrder();
        app.getNavigation().ss();
        app.getFoodOrders().selectWOK();
        app.getNavigation().ss();
        app.getFoodOrders().choiceUdonWithBeef_normal();
//        ** Проверка:
//        *** Блюдо добавлено в нижнюю таблицу:
//        **** № - 1
//        **** Блюдо -  Удон с говядиной Ньюпай Обычный
//        **** Есть кнопка "+" перед названием блюда
//        **** Кол-во блюд - 1
//        **** Комментарий - Добавить комментарий
//        **** Цена - 385 р.
//        **** Скидка - 0 р.
//        **** Стоимость - 385 р.
        app.getFoodOrders().selectDrinks_NonAlcoholic();
        app.getFoodOrders().choiceFruitJuice();
        app.getFoodOrders().addItemFood();
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