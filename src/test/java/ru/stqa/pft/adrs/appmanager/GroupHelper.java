package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.adrs.model.GroupDate;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {

        super(wd);
    }




    /*
    //Возврат на страницу Групп
    public void returnToGroupPage() {

        click(By.linkText("group page"));
    }

    //Добавление группы после заполнения полей
    public void submintGroupCreation() {

        click(By.name("submit"));
    }

    //Метод по заполнению полей в момент создания новой группы
    public void fillGroupForm(GroupDate groupDate) {
        type(By.name("group_name"), groupDate.getName());
        type(By.name("group_header"), groupDate.getHeader());
        type(By.name("group_footer"), groupDate.getFooter());
    }

    //Инициирование создание новой группы
    public void initGroupCreation() {

        click(By.name("new"));
    }

    //Удаление группы
    public void deleteSelectedGroup() {

        click(By.name("delete"));
    }

    //Выбор группы
    public void selectGroup() {
        click(By.xpath("//div[@id='content']/form[2]/input[2]"));
    }

    //Инициирование корректировки группы
    public void initGroupModification() {
        click(By.name("edit"));
    }

    //Сохранение скорректированных данных группы
    public void submintGroupModification() {
        click(By.name("update"));
    }
    */

}
