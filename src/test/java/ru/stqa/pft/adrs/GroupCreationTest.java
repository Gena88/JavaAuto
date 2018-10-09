package ru.stqa.pft.adrs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTest {

    FirefoxDriver wd;
//    ChromeDriver wd;
//    InternetExplorerDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\GitHub_repository\\geckodriver.exe");
        wd = new FirefoxDriver();
//        wd = new ChromeDriver();
//        wd = new InternetExplorerDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbookv4.1.4/");
        wd.findElement(By.cssSelector("html")).click();
        wd.findElement(By.linkText("home")).click();

    }
    
    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("test2", "test2", "test2"));
        submintGroupCreation();
        returnToGroupPage();
    }

    private void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    private void submintGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupDate groupDate) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupDate.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
    }

    private void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    private void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
