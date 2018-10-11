package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {

        this.wd = wd;
    }

    // Нажатие на клавишу (например нажимаем на клавишу иниициирования добавления новой группы)
    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    //Метод заполняющий выбранное поле (By locator), определенным текстом (text)
    protected void type(By locator, String text) {
        click(locator);
        if(text != null) {
            String existinText = wd.findElement(locator).getAttribute("value");
            if (! text.equals(existinText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
