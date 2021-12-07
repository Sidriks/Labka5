package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    private double maxtemp_c;
    private double maxtemp_f;
    private double mintemp_c;
    private double mintemp_f;
    private double avgtemp_c;
    private double avgtemp_f;
    private double maxwind_kph;
    private int avghumidity;
    private double totalprecip_mm;

    public Day() {}

    public double getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(double maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public double getMaxtemp_f() {
        return maxtemp_f;
    }

    public void setMaxtemp_f(double maxtemp_f) {
        this.maxtemp_f = maxtemp_f;
    }

    public double getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(double mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public double getMintemp_f() {
        return mintemp_f;
    }

    public void setMintemp_f(double mintemp_f) {
        this.mintemp_f = mintemp_f;
    }

    public double getAvgtemp_c() {
        return avgtemp_c;
    }

    public void setAvgtemp_c(double avgtemp_c) {
        this.avgtemp_c = avgtemp_c;
    }

    public double getAvgtemp_f() {
        return avgtemp_f;
    }

    public void setAvgtemp_f(double avgtemp_f) {
        this.avgtemp_f = avgtemp_f;
    }

    public double getMaxwind_kph() {
        return maxwind_kph;
    }

    public void setMaxwind_kph(double maxwind_kph) {
        this.maxwind_kph = maxwind_kph;
    }

    public int getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(int avghumidity) {
        this.avghumidity = avghumidity;
    }

    public double getTotalprecip_mm() {
        return totalprecip_mm;
    }

    public void setTotalprecip_mm(double totalprecip_mm) {
        this.totalprecip_mm = totalprecip_mm;
    }

    @Override
    public String toString() {
        return "\n Day{ \n" +
                "    maxtemp_c=" + maxtemp_c + "\n"+
                "    maxtemp_f=" + maxtemp_f + "\n" +
                "    mintemp_c=" + mintemp_c + "\n" +
                "    mintemp_f=" + mintemp_f + "\n" +
                "    avgtemp_c=" + avgtemp_c + "\n"+
                "    avgtemp_f=" + avgtemp_f + "\n"+
                "    maxwind_kph=" + maxwind_kph + "\n"+
                "    avghumidity=" + avghumidity + "\n"+
                "    totalprecip_mm=" + totalprecip_mm + "\n"+
                '}';
    }
}
