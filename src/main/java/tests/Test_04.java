package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class Test_04 {
//Verifying multiple content
//@Test
public void testHasItemFunction(){
    given().
        get("https://swapi.co/api/people/4/").
        then().
        body("films", hasItems ("https://swapi.co/api/films/6/", "https://swapi.co/api/films/1/"));
    }
}

//hasItems