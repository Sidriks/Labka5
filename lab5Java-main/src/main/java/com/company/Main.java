package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> cities = List.of("Одесса", "Киев", "Херсон");
        for(String city: cities){
            Thread thread = new Thread(() -> {
                try {
                    processForecastData(city);
                } catch (IOException  e) {
                    System.out.println(e.getLocalizedMessage());
                }
            });
            thread.start();
            System.out.println("Started thread for city: " + city);
        }

        System.out.println("Exit main thread");
    }

    private static void processForecastData(String city) throws IOException {
        System.out.println(city + ". Прогноз погоды(получение из json колекцию):");
        Forecast forecast = WeatherForecastLoader.getWeatherForecastByURL("f720c35b125e4c18a38191356201110", city, 3);
        System.out.println(forecast);

        System.out.println(city + ". Прогноз погоды(сортировка):");
        forecast.getForecast().getForecastDays().sort(ForecastDay.byMaxtemp_c);
        System.out.println(forecast);

        System.out.println(city + ". Прогноз погоды(фильтрация):");
        List<Day> days = forecast.getForecast().filterByAvgTempGreaterThan(5.2);
        System.out.println(days);
    }


}
