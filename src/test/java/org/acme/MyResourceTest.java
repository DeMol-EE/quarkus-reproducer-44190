package org.acme;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestHTTPEndpoint(MyResource.class)
class MyResourceTest {

    @Test
    void foo() {
        RestAssured
                .given()
                .when()
                .get()
                .then()
                .statusCode(200);
    }

}