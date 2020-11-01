package reusableRequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetEmployees 
{
	
	public String getRequest(String url)
	{
             
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get(url);
		
		String body = response.getBody().asString();
		
		return body;
	
     }
	
	
}
