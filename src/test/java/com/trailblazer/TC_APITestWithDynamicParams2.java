//package com.trailblazer;
//
//import com.trailblazer.services.APIHelper;
//import com.trailblazer.utilities.ConfigFilesUtility;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class TC_APITestWithDynamicParams2 {
//
//    private ConfigFilesUtility configFileObj;
//
//    @BeforeClass
//    public void setUp() throws Exception {
//        configFileObj = new ConfigFilesUtility();
//        configFileObj.loadPropertyFile("trailblazer.properties");
//    }
//
//    @Test
//    public void trailBazer() {
//
//
//        String url = configFileObj.getProperty("URL");
//
//        ArrayList<String> launch_site = new ArrayList<>();
//
//        launch_site.add("site_id");
//        launch_site.add("site_name");
//      //  launchesPast.add("id");
//
////
////        ArrayList<String> episodesParam = new ArrayList<>();
////        episodesParam.add("contentUrl");
////
////
////        ArrayList<String> speakersParam = new ArrayList<>();
////        speakersParam.add("speakerName");
////        speakersParam.add("jobTitle");
////        speakersParam.add("company");
//
//      // String query = Payload.getSeriesQuery2(launchesPast);
//        Map<String, String> headers = new HashMap<String, String>();
//        String query = Payload.getSeriesQuery2(launch_site);
//      //  String query = Payload.query;
//        String response  = APIHelper.post(url, query, headers);
//        System.out.println("response>>>"+response);
//
//        System.out.println("url>>>"+url);
//        System.out.println("query>>>"+query);
//        System.out.println("headers>>>"+headers);
//    }
//
//}
