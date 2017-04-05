package com.weather.request;

/**
 * Created by mdeshpande on 4/4/17.
 */


import com.weather.config.ClientUrlConfigurator;
import com.weather.response.TransactionResponse;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;


public class RequestHandler {

    private String locationKey;
    private static final String clientURL = ClientUrlConfigurator.rootClientURL;

    public RequestHandler(String locationName){

        UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromHttpUrl(clientURL)
                                            .path(ClientUrlConfigurator.routeForLocationKey)
                                            .queryParam("apikey", ClientUrlConfigurator.apiKey)
                                            .queryParam("q", locationName);
        String locationsURL = urlBuilder.build(false).encode().toUriString();
        List<TransactionResponse> responses = sendRequest(locationsURL);
        locationKey =  (responses.size() > 0 )?responses.get(0).getKeyForLocation():"";
    }

    private String getLocationKey(){
        return locationKey;
    }

    private String buildCurrentConditionsUrl(){
        String currentLocationKey = getLocationKey();
        UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromHttpUrl(clientURL)
                                        .path(ClientUrlConfigurator.routeForCurrentConditions)
                                        .path(currentLocationKey)
                                        .queryParam("apikey",ClientUrlConfigurator.apiKey);

        return urlBuilder.build(false).encode().toUriString();

    }

    private String buildForecastUrl(String dayLimit){
        String currentLocationKey = getLocationKey();
        String limitedDayForcast = dayLimit+ClientUrlConfigurator.foreCast +"/";

        UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromHttpUrl(clientURL)
                .path(ClientUrlConfigurator.routeForForecast)
                .path(limitedDayForcast)
                .path(currentLocationKey)
                .queryParam("apikey",ClientUrlConfigurator.apiKey);

        return urlBuilder.build(false).encode().toUriString();

    }

    private List<TransactionResponse> sendRequest(String url){
        RestTemplate restTemplate = new RestTemplate();
        TransactionResponse[] transactionResponses = restTemplate.getForObject(url, TransactionResponse[].class);
        return Arrays.asList(transactionResponses);
    }

    // TODO need a better name
    private TransactionResponse sendRequestForSingleResponse(String url){
        RestTemplate restTemplate = new RestTemplate();
        TransactionResponse transactionResponses = restTemplate.getForObject(url, TransactionResponse.class);
        return transactionResponses;
    }

    public List<TransactionResponse> sendCurrentConditionsRequest(){
        String currentConditionsURL = buildCurrentConditionsUrl();
        System.out.println(currentConditionsURL);
        return sendRequest(currentConditionsURL);
    }
    public TransactionResponse sendForeCastConditionsRequest(String limit){
        String forecastConditionsURL = buildForecastUrl(limit);
        System.out.println(forecastConditionsURL);
        return sendRequestForSingleResponse(forecastConditionsURL);
    }


}