package tests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDeleteExamples {

	@Test
	public void testPut() {
		Map<String,Object> map=new HashMap<String,Object>();
		/*map.put("name", "Raghav");		
		map.put("job", "Teacher");
		System.out.println(map);*/
		
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "teacher");
		System.out.println(request.toJSONString());
		
		baseURI ="https://reqres.in/api";
		given().
		  header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   put("/users/2").
		then().statusCode(200).log().all();
	}
	
	@Test
	public void testPatch() {
		Map<String,Object> map=new HashMap<String,Object>();
		/*map.put("name", "Raghav");		
		map.put("job", "Teacher");
		System.out.println(map);*/
		
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "teacher");
		System.out.println(request.toJSONString());
		
		baseURI ="https://reqres.in/";
		given().
		  header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   patch("api/users/2").
		then().statusCode(200).log().all();
	}
	
	@Test
	public void testDelete() {
		Map<String,Object> map=new HashMap<String,Object>();
		/*map.put("name", "Raghav");		
		map.put("job", "Teacher");
		System.out.println(map);*/
		
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "teacher");
		System.out.println(request.toJSONString());
		
		baseURI ="https://reqres.in/";
		when().
		   delete("api/users/2").
		then().statusCode(204).log().all();
	}
}
