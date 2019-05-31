package tests;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test_05 {
//Test xml response for single body content
public void testSingleXmlContent(){
    given().
            get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
            then().
            body("CUSTOMER.ID", equalTo("10")).
            log().all();
    }

}
