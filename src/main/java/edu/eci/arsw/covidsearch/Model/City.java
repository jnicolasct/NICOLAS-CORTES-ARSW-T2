/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.covidsearch.Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class City {
    String Name;
    int Kills;
    int Recovered;
    int Cases;
    String Province;

    public City(String Name, int Kills, int Recovered, int Cases, String Province) {
        this.Name = Name;
        this.Kills = Kills;
        this.Recovered = Recovered;
        this.Cases = Cases;
        this.Province = Province;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

}
