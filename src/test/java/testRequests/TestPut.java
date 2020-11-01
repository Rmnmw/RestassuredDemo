package testRequests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.JsonReader;
import reusableRequests.PutEmployees;



public class TestPut {
	
	@Test
	public void put_test_req() throws FileNotFoundException, IOException, ParseException
	{
		
		String response;
		JsonReader _JSONRead = new JsonReader();
		PutEmployees _putReq = new PutEmployees();
	    String Req_URL = _JSONRead.ReadJSONFile("Put_request", ".\\PreData\\PreData.json");
	    String first_name = _JSONRead.ReadJSONFile("first_name", ".\\PreData\\PreData.json");
	    String last_name = _JSONRead.ReadJSONFile("last_name", ".\\PreData\\PreData.json");
	    String email = _JSONRead.ReadJSONFile("email", ".\\PreData\\PreData.json");
	    System.out.println(Req_URL);
	    
	    response = _putReq. putRequest(Req_URL,"{\"first_name\" : \"" + first_name + "\" ,\"last_name\" : \"" + last_name + "\",\"email\" : \"" + email + "\"}");
	    System.out.println(response);
	    Assert.assertEquals(response.contains("200") , true , "Request is successful");
	   	
		
	}
	

}
