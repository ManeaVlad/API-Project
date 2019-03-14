package com.kitesurfing.kite.controller;

import java.util.List;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kitesurfing.kite.entity.Location;
import com.kitesurfing.kite.service.LocationService;

@RestController
public class LocationController {

    @Autowired
    @Qualifier("locationService")
    private LocationService locationService;
 
    @PostMapping("/api/createlocation")
    public void createNewLocation(@Valid @RequestBody Location location) {
        locationService.addLocation(location);
    }
 
    @PutMapping("/api/changelocation")
    public void changeExistingLocation(@Valid @RequestBody Location location) {
        locationService.modifyLocation(location);
    }
 
    @DeleteMapping("/api/removelocation/{id}")
    public void removeLocation(@PathVariable(value = "id") long locationId) {
        locationService.removeLocation(locationId);
    }
 
    @GetMapping("/api/viewsinglelocation/{id}")
    public Location viewLocationById(@PathVariable(value = "id") long locationId) {
        return locationService.getLocationById(locationId);
    }
 
    @GetMapping("/api/viewalllocation")
    public List<Location> viewAllLocation() {
        return locationService.getAllLocation();
    }
}
