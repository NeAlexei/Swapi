package tests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Test_02 {
//Verify code and print complete response in console
@Test
public void testLogging(){
    given().
            get("https://swapi.co/api/people/4/").
            then().
            statusCode(200).
            log().all();
    }
}
