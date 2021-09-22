//package com.trailblazer;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import com.trailblazer.services.APIHelper;
//import com.trailblazer.utilities.ConfigFilesUtility;
//
//
//public class TC_APITestWithDynamicParams {
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
//        ArrayList<String> seriesParam = new ArrayList<>();
//        seriesParam.add("cardImageUrl");
//        seriesParam.add("id");
//
//
//        ArrayList<String> episodesParam = new ArrayList<>();
//        episodesParam.add("contentUrl");
//
//
//        ArrayList<String> speakersParam = new ArrayList<>();
//        speakersParam.add("speakerName");
//        speakersParam.add("jobTitle");
//        speakersParam.add("company");
//
//        String query = Payload.getSeriesQuery(seriesParam, episodesParam, speakersParam);
//        Map<String, String> headers = new HashMap<String, String>();
//
//        String response  = APIHelper.post(url, query, headers);
//
//    }
//
//}
