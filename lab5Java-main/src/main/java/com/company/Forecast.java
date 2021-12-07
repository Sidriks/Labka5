package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;


import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast{
    private Location location;
    private ForecastDays forecast;

    public ForecastDays getForecast() {
        return forecast;
    }

    public void setForecast(ForecastDays forecast) {
        this.forecast = forecast;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Forecast() {
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "  location=" + location + "\n" +
                "  forecast=" + forecast +
                '}';
    }

}
