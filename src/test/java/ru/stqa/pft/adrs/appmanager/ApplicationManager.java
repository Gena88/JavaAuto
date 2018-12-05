package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private FoodOrders foodOrders;
    private Navigation navigation;
    private GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }


    public void init() {

        wd = new ChromeDriver();



        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://93.158.194.208:6005/login");
        wd.findElement(By.cssSelector("html")).click();
        foodOrders = new FoodOrders(wd);
        groupHelper = new GroupHelper(wd);
        navigation = new Navigation(wd);

        wd.findElement(By.linkText("home")).click();
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public FoodOrders getFoodOrders() {
        return foodOrders;
    }
}
