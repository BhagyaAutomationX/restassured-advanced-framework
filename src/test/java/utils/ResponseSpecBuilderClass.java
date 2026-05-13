package utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecBuilderClass {

    public static ResponseSpecification
    getResponseSpec() {

        return new ResponseSpecBuilder()

                .expectStatusCode(200)

                .build();
    }
}
