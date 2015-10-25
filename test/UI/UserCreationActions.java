package UI;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class UserCreationActions extends FluentPage{

    public static final String PAGE_TITLE = "Ninjas";
    private String url;

    public UserCreationActions(WebDriver webDriver) {
        super(webDriver);
        this.url = "";
    }
    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public void isAt() {
        assertEquals(PAGE_TITLE, find("#page_title").getText());

    }

}
