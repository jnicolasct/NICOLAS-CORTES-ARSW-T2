/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.covidsearch.HttpConnectionService.impl;

import edu.eci.arsw.covidsearch.HttpConnectionService.CovidHttpConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
public class CovidHttpConnectionImpl implements CovidHttpConnection {
    
     private String url;
    private String headerHost;
    private String headerHostValue;
    private String headerKey;
    private String headerKeyValue;
    private Gson gson;

    public CovidHttpConnectionImpl(){
        
        url = "https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country=";
        headerHost = "x-rapidapi-host";
        headerHostValue = "covid-19-coronavirus-statistics.p.rapidapi.com";
        headerKey = "x-rapidapi-key";
        headerKeyValue = "9cd3954848msh0c2f0da83391e1ap176616jsn57d0f92a29ed";
        gson = new GsonBuilder().create();
    }

    public String getCountryStats(String country) throws UnirestException {
        HttpResponse<String> response = Unirest.get(url+ country)
                .header(headerHost, headerHostValue)
                .header(headerKey, headerKeyValue)
                .asString();
        return response.getBody();
    }

    public String getAllCou() throws UnirestException {
        HttpResponse<String> response = Unirest.get(url)
                .header(headerHost, headerHostValue)
                .header(headerKey, headerKeyValue)
                .asString();
        return response.getBody();
    }
}
