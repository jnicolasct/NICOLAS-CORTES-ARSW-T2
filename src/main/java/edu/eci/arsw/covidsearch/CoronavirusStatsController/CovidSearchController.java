package edu.eci.arsw.covidsearch.CoronavirusStatsController;


import edu.eci.arsw.covidsearch.CoronavirusStatsServices.CovidServices;
import edu.eci.arsw.covidsearch.Model.City;
import edu.eci.arsw.covidsearch.Model.Country;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class CovidSearchController {
    HashMap<String, Country> countries = new HashMap<String, Country>();
    
    @Autowired
    CovidServices httpCon;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<?> getAllCases(){
        String dataTodo;
        try{
            dataTodo= httpCon.getAllCases();
            JSONArray lista = new JSONArray();
            JSONObject json = new JSONObject(dataTodo);
            JSONObject data = new JSONObject(json.get("data").toString());
            lista = new JSONArray(data.get("covid19Stats").toString());
            for (int i=0;i<lista.length();i++){
                JSONObject actual = (JSONObject) lista.get(i);
                String nombre = actual.get("country").toString();
                if (!countries.containsKey(nombre)){
                    Country nuevo = new Country(nombre);
                    countries.put(nombre, nuevo);
                }
                Country Coactual = countries.get(nombre);
                String Cnombre = actual.get("city").toString();
                int Ckills = Integer.parseInt(actual.get("deaths").toString());
                int CRecovered = Integer.parseInt(actual.get("recovered").toString());
                int Cases = Integer.parseInt(actual.get("confirmed").toString());
                String Cprovince = actual.get("province").toString();
                City Cactual = new City(Cnombre,Ckills,CRecovered,Cases,Cprovince);
                Coactual.addCity(Cactual);
                Coactual.calcularCases();
                Coactual.calcularKills();
                Coactual.calcularRecovered();   
            }
            return new ResponseEntity<>(dataTodo,HttpStatus.ACCEPTED);
        }catch(Exception ex){
            Logger.getLogger(CovidSearchController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
