package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Retry;
import utils.SpecBuilder;

import static io.restassured.RestAssured.*;

public class DeleteUserTest
        extends BaseTest {

    @BeforeClass
    public void init() {

        setup();
    }

    @Test(retryAnalyzer = Retry.class)

    public void deleteUserTest() {

        int statusCode =

                given()

                .spec(
                        SpecBuilder
                                .getRequestSpec())

                .when()

                .delete("/posts/1")

                .then()

                .extract().statusCode();

        Assert.assertTrue(
                statusCode == 204 ||
                statusCode == 200);
    }
}