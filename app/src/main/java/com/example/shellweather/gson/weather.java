package com.example.shellweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by DELL on 2019/4/23.
 */

public class weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Suggestion suggestion;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
