package tests;

import base.BaseTest;

import io.restassured.response.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Retry;
import utils.SpecBuilder;

import static io.restassured.RestAssured.*;

public class GetUserTest extends BaseTest {

    Logger log =
            LogManager.getLogger(
                    GetUserTest.class);

    @BeforeClass
    public void init() {

        setup();
    }

    @Test(retryAnalyzer = Retry.class)

    public void getUsersTest() {

        log.info("GET API STARTED");

        Response response =

                given()

                .spec(
                        SpecBuilder
                                .getRequestSpec())

                .when()

                .get("/users")

                .then()

                .extract().response();

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                200);

        log.info("GET API PASSED");
    }
}