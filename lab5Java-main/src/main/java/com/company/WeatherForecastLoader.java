package com.company;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherForecastLoader{
    private static final String URL = "https://api.weatherapi.com/v1/forecast.json?key=%s&q=%s&days=%d";

    public static Forecast getWeatherForecastByURL(String accessKey, String location, int days) throws IOException {
        String urlStr = String.format(URL, accessKey, location, days);
        String encodedURL = encodeUrl(urlStr);
        URL url = new URL(encodedURL);

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.connect();
        if (connection.getResponseCode() == 200) {
            String response = readResponse(connection.getInputStream());
            return new ObjectMapper().readValue(response, Forecast.class);
        } else {
            String response = readResponse(connection.getErrorStream());
            throw new IOException(String.format("Error getting data for %s: code = %d, description=%s", location, connection.getResponseCode(), response));
        }
    }

    private static String readResponse(InputStream responseStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (InputStream inputStreamReader = responseStream) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamReader, StandardCharsets.UTF_8));

            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                stringBuilder.append((char) ch);
            }
        }
        return stringBuilder.toString();
    }

    private static String encodeUrl(String urlStr) throws IOException {
        URI uri;
        try {
            uri = new URI(urlStr);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
        return uri.toASCIIString();
    }

}
