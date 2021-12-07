package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ForecastDay {
    private Day day;
    public static Comparator<ForecastDay> byMaxtemp_c = (ForecastDay day1, ForecastDay day2) -> Double.compare(day1.getDay().getMaxtemp_c(), day2.getDay().getMaxtemp_c());
    public static Comparator<ForecastDay> byMintemp_c = (ForecastDay day1, ForecastDay day2) -> Double.compare(day1.getDay().getMintemp_c(), day2.getDay().getMintemp_c());
    public static Comparator<ForecastDay> byAvghumidity = (ForecastDay day1, ForecastDay day2) -> Double.compare(day1.getDay().getAvghumidity(), day2.getDay().getAvghumidity());

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ForecastDay{" +
                "day=" + day +
                '}';
    }
}
