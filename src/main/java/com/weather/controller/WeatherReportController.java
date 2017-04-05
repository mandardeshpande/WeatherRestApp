package com.weather.controller;

/**
 * Created by mdeshpande on 4/4/17.
 */
import com.weather.request.RequestHandler;
import com.weather.response.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
//TODO Exception handling

@RestController
public class WeatherReportController {

    @RequestMapping(value="/weather",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    public List<TransactionResponse> getCurrentWeather(@RequestParam("q")  String locationName) {
        List<TransactionResponse> responseList = new ArrayList<>();
        try{
            RequestHandler requestHandler = new RequestHandler(locationName);
            responseList = requestHandler.sendCurrentConditionsRequest();
        } catch(Exception e){
            System.out.println(e.getMessage().toString());
        }

        return  responseList;
    }
    @RequestMapping(value="/weather/forecast",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            method = RequestMethod.GET)
    public TransactionResponse getForecastWeather(@RequestParam("q")  String locationName,@RequestParam("limit")  String limit) {

        TransactionResponse response = null;
        try{
            RequestHandler requestHandler = new RequestHandler(locationName);
            response = requestHandler.sendForeCastConditionsRequest(limit);
        }  catch(Exception e){
            System.out.println(e.getCause().toString());
        }

        return response;
    }


}
