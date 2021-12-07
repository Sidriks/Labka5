package com.company;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String name;
    private String region;
    private String tz_id;

    public Location() {
    }

    public String getTz_id() {
        return tz_id;
    }

    public void setTz_id(String tz_id) {
        this.tz_id = tz_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
