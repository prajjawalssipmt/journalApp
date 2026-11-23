package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String apiKey="f9b94209defe967fec062c86d918fcdc";

    private static final String API="https://api.apilayer.net/weatherstack/current?access_key=apiKey&query=CITY";

    @Autowired
    private RestTemplate restTemplate;


    public WeatherResponse getWeather(String city){

        String finalApi = API.replace("CITY", city).replace("apiKey", apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }
}
