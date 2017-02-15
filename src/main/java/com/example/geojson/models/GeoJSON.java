package com.example.geojson.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 2/14/17.
 */
public class GeoJSON {
    public String type = "FeatureCollection";

    public List<Feature> features = new ArrayList<>();

    public static GeoJSON buildGeoJson(Geometry g) {
        GeoJSON results = new GeoJSON();

        results.features.add(new Feature(g));

        return results;
    }
}
