package api.qa.techtorialwork.endpoints;

import api.qa.techtorialwork.pojo.PJ_CompanyInformation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigReader;

public class EP_CompanyInformation {

    public void validateCompanyInformation(String message,String name,String email,String phone){

        RestAssured.baseURI= ConfigReader.readProperty("baseUrl");
        RestAssured.basePath=ConfigReader.readProperty("company_information");

        Response response=RestAssured.given().header("Accept","application/json")
                .header("Authorization",ConfigReader.readProperty("bearer_token"))
                .when().get().then().statusCode(200).log().body().extract().response();

        PJ_CompanyInformation deserializedResponse=response.as(PJ_CompanyInformation.class);
        Assert.assertEquals(message,deserializedResponse.getMessage());
        Assert.assertEquals(name,deserializedResponse.getData().getCompany_name());
        Assert.assertEquals(email,deserializedResponse.getData().getCompany_email());
        Assert.assertEquals(phone,deserializedResponse.getData().getCompany_phone());
    }
}
