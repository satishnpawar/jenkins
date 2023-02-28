package test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import files.payload;
public class postRest {

	public static void main(String[] args) {                                                                
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(payload.addPlace())
		.when().post("/maps/api/place/add/json").
		then().log().all().statusCode(200).body("scope", equalTo ("APP")).header("Server", "Apache/2.4.41 (Ubuntu)");
		
		// we can set assertion or validation points for body , header contents etc
		
	RestAssured.baseURI="https://rahulshettyacademy.com";
	given().log().all().queryParam("key","qaclick123").when().get("/maps/api/place/add/json").then().log().all().statusCode(200);
	
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	given().log().all().queryParam("key", "qaclick123").when().put("{\r\n"
			+ "\"place_id\":\"e60a8adf0d142625434fc953d6c92763\",\r\n"
			+ "\"address\":\"70 Summer walk, USA\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}").then().log().all().statusCode(200);
	
	
	
		
	}
}
