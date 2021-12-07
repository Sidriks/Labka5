package com.company;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForecastDays {
    @JsonProperty("forecastday")
    private ArrayList<ForecastDay> forecastDays;

    public ForecastDays() {
    }

    public void add(ForecastDay forecastDay) {
        this.forecastDays.add(forecastDay);
    }

    public ArrayList<ForecastDay> getForecastDays() {
        return forecastDays;
    }

    public void setForecastDays(ArrayList<ForecastDay> forecastDays) {
        this.forecastDays = forecastDays;
    }

    @Override
    public String toString() {
        return "\n ForecastDays{ \n" +
                "day=" + forecastDays +
                '}';
    }

    public List<Day> filterByAvgTempGreaterThan(double temperature) {
        return forecastDays.stream()
                .map(ForecastDay::getDay)
                .filter(day -> day.getAvgtemp_c() > temperature)
                .collect(Collectors.toList());
    }

}
