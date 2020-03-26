/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.covidsearch.HttpConnectionService;

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
public interface CovidHttpConnection {
    
    public String getCountryStats(String country) throws UnirestException;
    public String getAllCou() throws UnirestException;
}
