package com.example;

import com.example.geojson.models.GeoJSON;
import com.example.geojson.models.Point;
import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ben on 2/14/17.
 */
@RestController
public class SampleController {

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public GeoJSON home() throws Exception {
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyB0m5YY3zTiOMxdO-8VTG4XVf9PhtnuROY\t");

        DirectionsApiRequest directionsRequest = DirectionsApi.newRequest(context);

        directionsRequest.origin("222 South Church Street, Charlotte, NC");
        directionsRequest.destination("New York, New York");

        DirectionsResult directionsResult = directionsRequest.await();

        return GeoJSON.buildGeoJson(new Point(directionsResult.routes[0].legs[0].steps[0].startLocation.lat, directionsResult.routes[0].legs[0].steps[0].startLocation.lng));
    }
}
