package ru.stqa.pft.adrs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.adrs.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}