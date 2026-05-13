package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class SpecBuilder {

    public static RequestSpecification getRequestSpec() {

        return new RequestSpecBuilder()

                .setBaseUri(
                        "https://jsonplaceholder.typicode.com")

                .addHeader(
                        "Content-Type",
                        "application/json")

                .build();
    }

    }

