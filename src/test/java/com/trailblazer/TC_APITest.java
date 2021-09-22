package com.trailblazer;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.trailblazer.services.APIHelper;
import com.trailblazer.utilities.ConfigFilesUtility;


public class TC_APITest {
	
	private ConfigFilesUtility configFileObj;

	@BeforeClass
	public void setUp() throws Exception {
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("trailblazer.properties");
	}
	
	@Test
	public void trailBazer() {
		String url = configFileObj.getProperty("URL");

		String query = Payload.query;
		Map<String, String> headers = new HashMap<String, String>();
		String response  = APIHelper.post(url, query, headers);
		System.out.println(response);
		System.out.println("url>>>"+url);
		System.out.println("query>>>"+query);
		System.out.println("headers>>>"+headers);

	}

}
