/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.covidsearch.CoronavirusStatsServices;

import com.mashape.unirest.http.exceptions.UnirestException;

/**
 *
 * @author user
 */
public interface CovidServices {
    
    public String getCountryStats(String country) throws UnirestException;
    public String getAllCases() throws UnirestException;
}
