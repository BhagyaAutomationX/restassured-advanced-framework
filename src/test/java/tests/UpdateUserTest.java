package tests;

import base.BaseTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import payload.UserPayload;

import utils.Retry;
import utils.SpecBuilder;

import static io.restassured.RestAssured.*;

public class UpdateUserTest
        extends BaseTest {

    @BeforeClass
    public void init() {

        setup();
    }

    @Test(retryAnalyzer = Retry.class)

    public void updateUserTest() {

        UserPayload payload =
                new UserPayload();

        payload.setName(
                "Updated Bhagya");

        payload.setJob(
                "Senior Tester");

        Response response =

                given()

                .spec(
                        SpecBuilder
                                .getRequestSpec())

                .contentType(
                        ContentType.JSON)

                .body(payload)

                .when()

                .put("/posts/1")

                .then()

                .extract().response();

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                200);
    }
}
