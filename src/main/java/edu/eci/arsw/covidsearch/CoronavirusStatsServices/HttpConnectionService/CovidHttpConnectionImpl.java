/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.covidsearch.CoronavirusStatsServices.HttpConnectionService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.covidsearch.CoronavirusStatsServices.CovidServices;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class CovidHttpConnectionImpl implements CovidServices {
    
    private String url;
    private String urlC;
    private String headerHost;
    private String headerHostValue;
    private String headerKey;
    private String headerKeyValue;
    private Gson gson;

    public CovidHttpConnectionImpl(){
        
        url = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats";
        urlC = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=";
        headerHost = "x-rapidapi-host";
        headerHostValue = "covid-19-coronavirus-statistics.p.rapidapi.com";
        headerKey = "x-rapidapi-key";
        headerKeyValue = "c47103c912msha835dcc27f42807p1e5d11jsnee6e7d9c33be";
        gson = new GsonBuilder().create();
    }

    @Override
    public String getCountryStats(String country) throws UnirestException {
        HttpResponse<String> response = Unirest.get(urlC + country)
                .header(headerHost, headerHostValue)
                .header(headerKey, headerKeyValue)
                .asString();
        //System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public String getAllCases() throws UnirestException {
        HttpResponse<String> response = Unirest.get(url)
                .header(headerHost, headerHostValue)
                .header(headerKey, headerKeyValue)
                .asString();
        //System.out.println(response.getBody());
        return response.getBody();
    }
}

