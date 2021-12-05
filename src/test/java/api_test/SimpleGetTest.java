package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleGetTest {
    private static final Logger LOGGER = LogManager.getLogger(SimpleGetTest.class);

    @Test
    public void getAllUsers() {
        LOGGER.info("--------API Test: Get All Users");

        // Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

       // Get the Request Specification of the request that you want to send to the server.
        // The server is specified by the BaseURI that we have specified i the above step.
        RequestSpecification httpRequest = RestAssured.given();

        //Make a request to the server by specifying the method type and the method url.
        //This will return the response from the server. store the response in a variable.
        Response response = httpRequest.request(Method.GET);
        //LOGGER.debug(response.getBody().asString());
        //or
        LOGGER.debug(response.prettyPrint());

        // Assert that the correct status is returned.
        Assert.assertEquals(response.getStatusCode(), 200);

        //Get the json path object instance from the response.
        JsonPath jsonPath = response.jsonPath();
        List<String> list =jsonPath.get("data.email");

        //Validate that one specific user email doesnt exist in the response body.
        String emailId = "george.bluth@reqres.in";
        boolean emailExist = list.contains(emailId);
        Assert.assertTrue(emailExist, emailId+ "doesn't exist");

        LOGGER.info(("-------End Test: Get All Users--------"));

    }
}
