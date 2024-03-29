package reusableRequests;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutEmployees {
	
	public String putRequest(String url, String paramaters)
	{
		 RequestSpecification request = RestAssured.given();
		 request.header("Content-Type", "application/json");
		
		 JSONObject jsonObj = new JSONObject(paramaters);
	
		 request.body(jsonObj.toString());
		 Response response = request.put(url);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("Retruned Status Code : " + statusCode);
		  
		return Integer.toString(statusCode);
	}
}