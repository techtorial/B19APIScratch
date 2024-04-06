package api.qa.techtorialwork.stepdefinitions;

import api.qa.techtorialwork.endpoints.EP_AppLogin;
import io.cucumber.java.en.Then;
import utils.ConfigReader;

public class SD_AppLogin {
    EP_AppLogin epAppLogin=new EP_AppLogin();

    @Then("User calls and validates {string} from login end point call")
    public void user_calls_and_validates_from_login_end_point_call(String expectedMessage) {
    epAppLogin.validateLoginMessage(ConfigReader.readProperty("username"),
                                    ConfigReader.readProperty("password"),expectedMessage);
    }
}
