package testRequests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.JsonReader;
import reusableRequests.DeleteEmployees;



public class TestDelete {
	
	@Test
	public void delete_test_req() throws FileNotFoundException, IOException, ParseException
	{
		
		String response;
		JsonReader _JSONRead = new JsonReader();
		DeleteEmployees _DeltReq = new DeleteEmployees();
		
		String Req_URL = _JSONRead.ReadJSONFile("Delete_request", ".\\PreData\\PreData.json");
	    response = _DeltReq.deleteRequest(Req_URL);

	    Assert.assertEquals(response.contains("200") , true , "Request is successful");
		
	}
	
}
