package api.qa.techtorialwork.stepdefinitions;

import api.qa.techtorialwork.endpoints.EP_CompanyInformation;
import io.cucumber.java.en.Then;

public class SD_CompanyInformation {
    EP_CompanyInformation epCompanyInformation =new EP_CompanyInformation();
    @Then("User calls and validates {string},{string},{string},{string} from Company End point")
    public void user_calls_and_validates_from_company_end_point(String message, String name, String email, String phone) {
    epCompanyInformation.validateCompanyInformation(message,name,email,phone);
    }
}
