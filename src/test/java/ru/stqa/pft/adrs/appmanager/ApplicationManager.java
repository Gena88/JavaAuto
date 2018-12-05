package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private FoodOrders foodOrders;
    private Navigation navigation;
    private MakingOrders makingOrders;
    private SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }


    public void init() {

        wd = new ChromeDriver();



        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("http://93.158.194.208:6005/login");
//        wd.findElement(By.cssSelector("html")).click();
        foodOrders = new FoodOrders(wd);
        makingOrders = new MakingOrders(wd);
        navigation = new Navigation(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("test", "test");
        sessionHelper.selectBranch();

    }

    public void stop() {
        wd.quit();
    }

    public MakingOrders getMakingOrders() {
        return makingOrders;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public FoodOrders getFoodOrders() {
        return foodOrders;
    }
}
