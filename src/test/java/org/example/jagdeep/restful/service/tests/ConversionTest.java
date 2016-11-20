/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.restful.service.tests;

import static org.assertj.core.api.Assertions.*;
import static com.jayway.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.jayway.restassured.path.json.JsonPath;

class ConversionTest {
    
    @Test
    @DisplayName("Conversion from fahrenheit to centigrade.")
    void conversionTest() {
        JsonPath conversion = given().contentType("application/json")
                .when().get("http://localhost:8080/app/api/ftoc/100").then()
                .statusCode(200).extract().jsonPath();
        
        assertThat(conversion.getInt("fahrenheit")).isEqualTo(100);
        assertThat(conversion.getInt("centigrade")).isEqualTo(38);
    }
}