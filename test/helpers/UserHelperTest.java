package helpers;

import models.CreateFormUser;
import models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserHelperTest {

    public static final String USER_NAME = "Hans";
    public static final String DEGREE = "Game Design";
    public static final String ABOUT_TEXT = "some text";

    UserHelper userHelper;

    @Before
    public void setUp(){
        userHelper = new UserHelper();
    }

    @Test
    public void testMapUserFromForm() throws Exception {
        CreateFormUser createFormUser = new CreateFormUser(USER_NAME, DEGREE, ABOUT_TEXT);
        User newUSer = userHelper.mapUserFromForm(createFormUser);
        assertEquals(USER_NAME, newUSer.userName);
        assertEquals(DEGREE, newUSer.degree);
        assertEquals(ABOUT_TEXT, newUSer.aboutText);
    }
}