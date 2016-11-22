/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.restful.service.tests;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.equalTo;
import static com.jayway.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.jayway.restassured.path.json.JsonPath;

class ConversionTest {
    
    @Test
    @DisplayName("Conversion from fahrenheit to centigrade.")
    void conversionF2CTest() {
        JsonPath conversion = given()
                .contentType("application/json")
                .when()
                .get("http://localhost:4444/app/api/conversion/toCentigrade/100")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath();
        assertThat(conversion.getInt("fahrenheit")).isEqualTo(100);
        assertThat(conversion.getInt("centigrade")).isEqualTo(37);
    }
    
    @Test
    @DisplayName("Conversion from fahrenheit to centigrade with zero input.")
    void conversionF2ZeroCTest() {
        JsonPath conversion = given()
                .contentType("application/json")
                .when()
                .get("http://localhost:4444/app/api/conversion/toCentigrade/0")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath();
        assertThat(conversion.getInt("fahrenheit")).isEqualTo(0);
        assertThat(conversion.getInt("centigrade")).isEqualTo(-17);
    }
    
    @Test
    @DisplayName("Conversion from fahrenheit to centigrade with negative input.")
    void conversionF2NegativeCTest() {
        JsonPath conversion = given()
                .contentType("application/json")
                .when()
                .get("http://localhost:4444/app/api/conversion/toCentigrade/-1")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath();
        assertThat(conversion.getInt("fahrenheit")).isEqualTo(-1);
        assertThat(conversion.getInt("centigrade")).isEqualTo(-18);
    }
    
    @Test
    @DisplayName("Conversion from fahrenheit to centigrade with very large input.")
    void conversionF2MoreThanIntSizeCTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toCentigrade/2147483648")
                .then().statusCode(404);
    }
    
    @Test
    @DisplayName("Invalid input alphanumeric.")
    void conversionF2CAlphanumericInputTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toCentigrade/a")
                .then().statusCode(404);
    }
    
    @Test
    @DisplayName("Invalid input special character.")
    void conversionF2CSpecialCharacterInputTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toCentigrade/$")
                .then().statusCode(404);
    }
    
    @Test
    @DisplayName("Conversion from centigrade to fahrenheit.")
    void conversionC2FTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toFahrenheit/37")
                .then().body("conversion.centigrade", equalTo("37"))
                .body("conversion.fahrenheit", equalTo("98"));
    }
    
    @Test
    @DisplayName("Conversion from centigrade to fahrenheit with zero input.")
    void conversionC2ZeroFTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toFahrenheit/0")
                .then().body("conversion.centigrade", equalTo("0"))
                .body("conversion.fahrenheit", equalTo("32"));
    }
    
    @Test
    @DisplayName("Conversion from centigrade to fahrenheit with negative input.")
    void conversionC2NegativeFTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toFahrenheit/-1")
                .then().body("conversion.centigrade", equalTo("-1"))
                .body("conversion.fahrenheit", equalTo("31"));
    }
    
    @Test
    @DisplayName("Conversion from centigrade to fahrenheit with very large input.")
    void conversionC2MoreThanIntSizeFTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toFahrenheit/2147483648")
                .then().statusCode(404);
    }
    
    @Test
    @DisplayName("Invalid Input alphanumeric.")
    void conversionAlphanumericInputTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toFahrenheit/a")
                .then().statusCode(404);
    }
    
    @Test
    @DisplayName("Invalid Input special character.")
    void conversionSpecialCharacterInputTest() {
        given().when()
                .get("http://localhost:4444/app/api/conversion/toFahrenheit/$")
                .then().statusCode(404);
    }
    
}