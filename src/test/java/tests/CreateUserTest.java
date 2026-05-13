package tests;

import base.BaseTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import payload.UserPayload;

import utils.DataProviderClass;
import utils.Retry;
import utils.SpecBuilder;

import static io.restassured.RestAssured.*;

public class CreateUserTest
        extends BaseTest {

    @BeforeClass
    public void init() {

        setup();
    }

    @Test(
            dataProvider = "userData",
            dataProviderClass =
                    DataProviderClass.class,

            retryAnalyzer = Retry.class
    )

    public void createUserTest(
            String name,
            String job) {

        UserPayload payload =
                new UserPayload();

        payload.setName(name);

        payload.setJob(job);

        Response response =

                given()

                .spec(
                        SpecBuilder
                                .getRequestSpec())

                .contentType(
                        ContentType.JSON)

                .body(payload)

                .when()

                .post("/posts")

                .then()

                .extract().response();

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                201);
    }
}
