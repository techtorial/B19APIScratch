package api.qa.techtorialwork.endpoints;

import api.qa.techtorialwork.pojo.PJ_AppLogin;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.ConfigReader;
import utils.PayLoadUtils;

public class EP_AppLogin {

    public void validateLoginMessage(String username,String password,String message){
        RestAssured.baseURI= ConfigReader.readProperty("baseUrl");
        RestAssured.basePath=ConfigReader.readProperty("app_login");

        Response response=RestAssured.given().
                header("Content-Type","application/json")
                .header("Accept","application/json")
                .body(PayLoadUtils.loginPayLoad(username,password))
                .when().post().then().statusCode(200).log().body().extract().response();

        PJ_AppLogin deserializedResponse=response.as(PJ_AppLogin.class);

        Assert.assertEquals(message,deserializedResponse.getMessage());

        System.out.println("Updating existing file.");
        System.out.println("New Branch changes");
    }
}