package testRequests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.JsonReader;
import reusableRequests.GetEmployees;




public class TestGet 
{
    
    @Test
    public void getAllEmployees() throws FileNotFoundException, IOException, ParseException
    {
    	String response;
    	JsonReader _JSONRead = new JsonReader();
    	GetEmployees _getReq = new GetEmployees();
    	String Req_URL = _JSONRead.ReadJSONFile("Base_Url", ".\\PreData\\PreData.json");
		response = _getReq.getRequest(Req_URL);
		 Assert.assertEquals(response.contains("first_name") , true , "Get request is succefull");
		
}
    }
