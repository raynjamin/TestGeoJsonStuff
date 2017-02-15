package com.example.geojson.models;

import java.util.HashMap;

/**
 * Created by Ben on 2/14/17.
 */
public class Feature {
    public String type = "Feature";
    public Geometry geometry;
    public HashMap<String, String> properties;

    public Feature() {
    }

    public Feature(Geometry geometry) {
        this.geometry = geometry;
    }
}
