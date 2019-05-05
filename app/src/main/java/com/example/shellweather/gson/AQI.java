package com.example.shellweather.gson;

/**
 * Created by DELL on 2019/4/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
