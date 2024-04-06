package api.qa.techtorialwork.stepdefinitions;

import api.qa.techtorialwork.endpoints.EP_AppInformation;
import io.cucumber.java.en.Then;

public class SD_AppInformation {

    EP_AppInformation epAppInformation=new EP_AppInformation();

    @Then("User validates {string},{string},{string}, and {string} from App Response")
    public void user_validates_and_from_app_response(String expectedMessage, String expectedCompanyName, String expectedCompanyEmail, String expectedCompanyWebsite) {
    epAppInformation.validateAppInformation(expectedMessage,expectedCompanyName,expectedCompanyEmail,expectedCompanyWebsite);
    }
}
