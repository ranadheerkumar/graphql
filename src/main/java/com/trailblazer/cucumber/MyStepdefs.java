package com.trailblazer.cucumber;

import com.trailblazer.Payload;
import com.trailblazer.services.APIHelper;
import com.trailblazer.utilities.ConfigFilesUtility;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyStepdefs {


    @Given("Parameterize graphql query {string}")
    public void parameterize_graphql_query(String string) {
        // Write code here that turns the phrase above into concrete actions

        ConfigFilesUtility  configFileObj = new ConfigFilesUtility();
        try {
            configFileObj.loadPropertyFile("trailblazer.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = configFileObj.getProperty("URL");

        ArrayList<String> launch_site = new ArrayList<>();

        launch_site.add(string);

        Map<String, String> headers = new HashMap<String, String>();
        String query = Payload.getSeriesQuery2(launch_site);
        //  String query = Payload.query;
        String response  = APIHelper.post(url, query, headers);
        System.out.println("response>>>"+response);

        System.out.println("url>>>"+url);
        System.out.println("query>>>"+query);
        System.out.println("headers>>>"+headers);
        throw new io.cucumber.java.PendingException();
    }

}
