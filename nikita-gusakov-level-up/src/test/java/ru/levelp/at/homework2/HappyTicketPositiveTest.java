package ru.levelp.at.homework2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelp.at.homework2.util.GroupName;


public class HappyTicketPositiveTest {

    @DataProvider(name = "positive-data-provider")
    public static Object[][] positiveDP() {
        return new Object[][] {
                {"123321", true},
                {"999999", true},
                {"000000", true},
                {"543921", true},
                {"123", false},
                {"1234567", false},
                {"543643", false},
                //{"123123", false}
        };
    }

    @Test(dataProvider = "positive-data-provider",
            groups = {GroupName.POSITIVE})
    public void happyTicketCheckPositiveTest(String actualValue, Boolean expectedResult) {

        assert HappyTicket.check(actualValue) == expectedResult
                : String.format("Для значения %s ожидается результат %s, но получен результат %s",
                actualValue,
                expectedResult,
                !expectedResult);
    }

}
