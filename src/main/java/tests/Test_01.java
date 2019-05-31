package tests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Test_01 {
//Checking status code
@Test
public void testStatusCode() {
    given().
            get("https://swapi.co/api/people/4/").
            then().
            statusCode(200);
    }
}
