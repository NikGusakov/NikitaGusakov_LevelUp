package ru.levelp.at.homework2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelp.at.homework2.util.GroupName;

public class HappyTicketNegativeTest {

    @DataProvider(name = "negative-data-provider")
    public static Object[][] negativeDP() {
        return new Object[][] {
                {"asdasd"},
                {"      "},
                {"123.569"},
                {"123-123"},
                {""},
                {null},
                //{"123132"}
        };
    }

    @Test(dataProvider = "negative-data-provider",
            groups = {GroupName.NEGATIVE},
            expectedExceptions = {IllegalArgumentException.class})
    public void happyTicketCheckNegativeTest(String actualValue) {
        HappyTicket.check(actualValue);
    }

}
