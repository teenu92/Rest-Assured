package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestMyself {

	@Test
	public void testOne() {
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
	//	System.out.println(response.getContentType());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getBody().asString());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode /*actualvalue */,200/*expected value */,"Correct Status Code Returned");
	}
}
