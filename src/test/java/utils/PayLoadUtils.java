package utils;

public class PayLoadUtils {

    public static String loginPayLoad(String username,String password){

        String body="{\n" +
                "    \"email\":\""+username+"\",\n" +
                "    \"password\":\""+password+"\"\n" +
                "}";

        return body;
    }
}
