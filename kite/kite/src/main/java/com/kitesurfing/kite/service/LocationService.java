package com.kitesurfing.kite.service;

import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kitesurfing.kite.entity.Location;
import com.kitesurfing.kite.DAO.LocationDao;

@Service("locationService")
public class LocationService {
    @Autowired
    @Qualifier("locationDao")
    private LocationDao locationDao;
 
    @Transactional
    public Location getLocationById(long locationId) {
 
        return locationDao.selectLocationById(locationId);
    }
 
    @Transactional
    public void addLocation(Location location) {
        locationDao.insertLocation(location);
    }
 
    @Transactional
    public void modifyLocation(Location location) {
        locationDao.updateLocation(location);
    }
 
    @Transactional
    public List<Location> getAllLocation() {
        return locationDao.selectAllLocation();
 
    }
 
    @Transactional
    public void removeLocation(long locationId) {
        locationDao.deleteLocation(locationId);
 
    }
}
