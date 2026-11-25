package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.chache.AppCache;
import net.engineeringdigest.journalApp.constant.PlaceHolder;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

//    private String apiKey="f9b94209defe967fec062c86d918fcdc";

    @Value("${weather.api.key}")
    private String apiKey;

//    private static final String API="https://api.apilayer.net/weatherstack/current?access_key=apiKey&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    public WeatherResponse getWeather(String city){

        String finalApi = appCache.appCacheMap.get(AppCache.keys.WEATHER_API.toString()).replace(PlaceHolder.CITY, city).replace(PlaceHolder.API_KEY, apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }
}
