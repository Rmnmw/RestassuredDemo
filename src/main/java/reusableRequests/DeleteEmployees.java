package reusableRequests;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployees {
	
	public String deleteRequest(String url)
	{
		RequestSpecification httpRequest = RestAssured.given();
		
	    
		Response response = httpRequest.delete(url);
		
			
		 int statusCode = response.getStatusCode();
		 System.out.println("Retruned Status Code : " + statusCode);
		  
		return Integer.toString(statusCode);
	}
}
