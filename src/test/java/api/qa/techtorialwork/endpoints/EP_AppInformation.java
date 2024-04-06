package api.qa.techtorialwork.endpoints;

import api.qa.techtorialwork.pojo.PJ_AppInformation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigReader;

public class EP_AppInformation {

    public void validateAppInformation(String expectedMessage,String expectedCompanyName,String expectedCompanyEmail,
    String expectedCompanyWebsite){
        RestAssured.baseURI= ConfigReader.readProperty("baseUrl");
        RestAssured.basePath=ConfigReader.readProperty("app_information");

        Response response=RestAssured.given().header("Accept","application/json")
                .when().get().then().log().body().statusCode(200).extract().response();

        PJ_AppInformation deserializedResponse=response.as(PJ_AppInformation.class);
        Assert.assertEquals(expectedMessage,deserializedResponse.getMessage());
        Assert.assertEquals(expectedCompanyName,deserializedResponse.getData().getCompany_name());
        Assert.assertEquals(expectedCompanyEmail,deserializedResponse.getData().getCompany_email());
        Assert.assertEquals(expectedCompanyWebsite,deserializedResponse.getData().getWebsite());
    }
}
