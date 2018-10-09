package ru.stqa.pft.adrs.test;

import org.testng.annotations.Test;
import ru.stqa.pft.adrs.model.GroupDate;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModificationTest(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupDate("Test", "Test", "Test"));
        app.getGroupHelper().submintGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}
