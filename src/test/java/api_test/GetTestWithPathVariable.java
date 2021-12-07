package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetTestWithPathVariable extends BaseClassAPITest {
//    private static final Logger LOGGER = LogManager.getLogger(GetTestWithPathVariable.class);
//As we declared the logger in BaseClassAPITest.
    @Test
    public void getSingleUser() {
        LOGGER.info((testCaseName));

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        String id = "2";
        Response response = httpRequest.request(Method.GET, id);
        //LOGGER.debug(response.getBody().asString());
        // or
        LOGGER.debug(response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();

        String actualEmailId = jsonPath.getString("data.email");
        String expectedEmailId = "janet.weaver@reqres.in";

        Assert.assertEquals(actualEmailId, expectedEmailId);

        LOGGER.info("------End Test: Get All Users With Query Parameter---------");
    }

    @Test
    public void attemptToGetUserWithInvalidId() {
        LOGGER.info((testCaseName));

        RestAssured.baseURI = "https://reqres.in/api/users";

        RequestSpecification httpRequest = RestAssured.given();

        String id = "23";
        Response response = httpRequest.request(Method.GET, id);
        //LOGGER.debug(response.getBody().asString());
        //or
        LOGGER.debug(response.prettyPrint());

        Assert.assertEquals(response.getStatusCode(), 404);

        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.get().toString(), "{}");

        LOGGER.info(endTestCase);

    }
}
