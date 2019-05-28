package tests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test_03 {
//Verifying single content
//@Test
public void testEqualToFunction(){
    given().
            get("https://swapi.co/api/people/4/").
            then().
            body("name", equalTo("Darth Vader"));
    }
}

//equalTo