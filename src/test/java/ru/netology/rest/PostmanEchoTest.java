package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldTestSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Hi")
                .when().log().all()
                .post("/post")
                .then().log().all()
                .statusCode(200)
                .body("data", equalTo("Hello world"))
        ;
    }
}
