package UI;

import org.fluentlenium.core.FluentPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import play.libs.F;
import play.test.TestBrowser;

import static play.test.Helpers.*;

@RunWith(MockitoJUnitRunner.class)
public class UserCreationUITest extends FluentPage{

    private final String EXPECTED_THIRD_DROPDOWN_OPTION = "Bekleidungstechnik";

    @Test
    public void dropdownOptionAreDisplayedCorrectly() {
        running(testServer(), FIREFOX, new F.Callback<TestBrowser>() {
            @Override
            public void invoke(TestBrowser browser) {
                UserCreationActions userCreationPage = (UserCreationActions) new
                        UserCreationActions(browser.getDriver()).withDefaultUrl(browser.getBaseUrl());
                browser.goTo("/user/create");
                String actual_dropdown_option = browser.find("option").get(2).getText();
                Assert.assertEquals(EXPECTED_THIRD_DROPDOWN_OPTION, actual_dropdown_option);
            }
        });
    }
}
