package edu.eci.arsw.covidsearch.CoronavirusStatsController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class CovidSearchController {

    @RequestMapping(value="/Cases",method= RequestMethod.GET)
    public String stats() {
        return "index";
    }


}
