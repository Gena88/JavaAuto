package ru.stqa.pft.adrs.test;
import org.testng.annotations.Test;
import ru.stqa.pft.adrs.model.GroupDate;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupDate("test2", null, null));
        app.getGroupHelper().submintGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
