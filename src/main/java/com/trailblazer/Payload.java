package com.trailblazer;

import com.trailblazer.utilities.ConfigFilesUtility;

import java.util.ArrayList;


public class Payload {


    public static final String query = "{\n" +
            "  launchesPast {\n" +
            "    mission_name\n" +
            "    launch_date_local\n" +
            "    launch_site {\n" +
            "      site_name_long\n" +
            "    }\n" +
            "    links {\n" +
            "      article_link\n" +
            "      video_link\n" +
            "    }\n" +
            "    rocket {\n" +
            "      rocket_name\n" +
            "      first_stage {\n" +
            "        cores {\n" +
            "          flight\n" +
            "          core {\n" +
            "            reuse_count\n" +
            "            status\n" +
            "          }\n" +
            "        }\n" +
            "      }\n" +
            "      second_stage {\n" +
            "        payloads {\n" +
            "          payload_type\n" +
            "          payload_mass_kg\n" +
            "          payload_mass_lbs\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "    ships {\n" +
            "      name\n" +
            "      home_port\n" +
            "      image\n" +
            "    }\n" +
            "  }\n" +
            "}";

    public static final String getSeriesQuery2(ArrayList<String> launch_site) {


        String query2 = "{\n" +
                "  launchesPast {\n" +
                "  launch_site " +
                          "{\n" +    getData(launch_site) +
                "    }\n" +
                "  }\n" +
                "}\n";

        return query2;

    }
    public static final String getSeriesQuery(ArrayList<String> seriesParam, ArrayList<String> episodesParam, ArrayList<String> speakersParam) {


        String query = "query {\n"

                + "series(uniqueId: \"E2E712_CG_Series2\") {\n"

                + getData(seriesParam) + "\n"


                + "    episodes {\n"

                + getData(episodesParam)


                + "      speakers {\n"

                + getData(speakersParam)

                + "      }\n"

                + "    }\n"

                + "    speakers {\n"

                + "      speakerId\n"

                + "    }\n"

                + "  }\n"

                + "}";


        return query;

    }

    private static String getData(ArrayList<String> param) {

        String finalData = "";

        for (int i = 0; i < param.size(); i++) {

            finalData = finalData + param.get(i) + "\r\n";

        }

        return finalData;

    }


}