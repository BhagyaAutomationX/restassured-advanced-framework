package tests;

import base.BaseTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import payload.UserPayload;

import utils.SpecBuilder;

import static io.restassured.RestAssured.*;

public class E2EFlowTest extends BaseTest {

    int userId = 1;

    @BeforeClass
    public void init() {

        setup();
    }

    @Test(priority = 1)

    public void createUser() {

        UserPayload payload =
                new UserPayload();

        payload.setName("Bhagya");

        payload.setJob("Automation Tester");

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
                "CREATE RESPONSE");

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                201);

        System.out.println(
                "CREATED ID : " + userId);
    }

    @Test(priority = 2)

    public void getUser() {

        Response response =

                given()

                .spec(
                        SpecBuilder
                                .getRequestSpec())

                .when()

                .get("/posts/" + userId)

                .then()

                .extract().response();

        System.out.println(
                "GET RESPONSE");

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                200);
    }

    @Test(priority = 3)

    public void updateUser() {

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

                .put("/posts/" + userId)

                .then()

                .extract().response();

        System.out.println(
                "UPDATE RESPONSE");

        System.out.println(
                response.asPrettyString());

        Assert.assertEquals(
                response.statusCode(),
                200);
    }

    @Test(priority = 4)

    public void deleteUser() {

        Response response =

                given()

                .spec(
                        SpecBuilder
                                .getRequestSpec())

                .when()

                .delete("/posts/" + userId)

                .then()

                .extract().response();

        System.out.println(
                "DELETE RESPONSE");

        System.out.println(
                response.asPrettyString());

        Assert.assertTrue(

                response.statusCode() == 200 ||

                response.statusCode() == 204
        );
    }
}