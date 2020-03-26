/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.covidsearch.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Country {
    int Latitud;
    int Longitud;
    String Name;
    ArrayList<City> Cities; 
    int Kills;
    int Recovered;
    int Cases;

    public Country(int Latitud, int Longitud, String Name, int Kills, int Recovered, int Cases) {
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.Name = Name;
        this.Kills = Kills;
        this.Recovered = Recovered;
        this.Cases = Cases;
        this.Cities = new ArrayList<City>();
    }
    
    public Country(String Name){
     this.Name = Name;   
    }

    public int getLatitud() {
        return Latitud;
    }

    public void setLatitud(int Latitud) {
        this.Latitud = Latitud;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<City> getCities() {
        return Cities;
    }

    public void setCities(ArrayList<City> Cities) {
        this.Cities = Cities;
    }

    public int getKills() {
        return Kills;
    }

    public void setKills(int Kills) {
        this.Kills = Kills;
    }

    public int getRecovered() {
        return Recovered;
    }

    public void setRecovered(int Recovered) {
        this.Recovered = Recovered;
    }

    public int getCases() {
        return Cases;
    }

    public void setCases(int Cases) {
        this.Cases = Cases;
    }
    
    public void calcularKills(){
        int cont = 0;
        for (int i=0; i<Cities.size(); i++){
            cont += Cities.get(i).getKills();
        }
        this.Kills = cont; 
    }
    
    public void calcularCases(){
        int cont = 0;
        for (int i=0; i<Cities.size(); i++){
            cont += Cities.get(i).getCases();
        }
        this.Cases = cont; 
    }
    
    public void calcularRecovered(){
        int cont = 0;
        for (int i=0; i<Cities.size(); i++){
            cont += Cities.get(i).getRecovered();
        }
        this.Recovered = cont; 
    }
    
    public void addCity(City city){
        Cities.add(city);
    }
    
}
