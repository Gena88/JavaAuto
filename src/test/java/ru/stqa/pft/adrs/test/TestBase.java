package ru.stqa.pft.adrs.test;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.adrs.appmanager.ApplicationManager;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();

    }

//    @AfterSuite
//    public void tearDown() {
//
//        app.stop();
//    }

}
