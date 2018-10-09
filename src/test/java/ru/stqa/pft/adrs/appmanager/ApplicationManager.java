package ru.stqa.pft.adrs.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    FirefoxDriver wd;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;



    public void init() {
//        System.setProperty("webdriver.gecko.driver","C:\\GitHub_repository\\geckodriver.exe");
       wd = new FirefoxDriver();
//        wd = new ChromeDriver();
//        wd = new InternetExplorerDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbookv4.1.4/");
        wd.findElement(By.cssSelector("html")).click();
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        wd.findElement(By.linkText("home")).click();
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
