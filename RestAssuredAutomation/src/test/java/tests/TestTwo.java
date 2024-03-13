package tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestTwo {
	
	@Test
	public void test_2() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).
		body("data[1].id", equalTo(8)).log().all();
		
	}

	@Test
	public void test_3() {
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
		body("data[2].id", equalTo(9)).log();
	}
		
}

