package hu.consumeSoldierAPI.service;

import hu.consumeSoldierAPI.domain.Soldier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldierService {

    @Autowired
    private RestTemplate restTemplate;
    private final String REST_URL = "http://localhost:8080/soldiers";

    public List<Soldier> getSoldiers() {
        String url = REST_URL;
        Soldier[]soldiers =  restTemplate.getForObject(url, Soldier[].class);
        return Arrays.asList(soldiers);
    }
}

