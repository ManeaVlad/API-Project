package com.kitesurfing.kite.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import org.springframework.stereotype.Repository;
import com.kitesurfing.kite.entity.Location;

@Repository("locationDao")
public class LocationDao {
    @PersistenceContext
    private EntityManager entityManager;
 
    public Location selectLocationById(long locationId) {
        return entityManager.find(Location.class, locationId);
    }
 
    public void insertLocation(Location location) {
        entityManager.persist(location);
    }
 
    public void updateLocation(Location location) {
 
        Location locationToUpdate = selectLocationById(location.getLocationId());
 
        locationToUpdate.setLocationName(location.getLocationName());
        locationToUpdate.setLocationLongitude(location.getLocationLongitude());
        locationToUpdate.setLocationLatitude(location.getLocationLatitude());
        locationToUpdate.setLocationWindProbability(location.getLocationWindProbability());
        locationToUpdate.setLocationCountry(location.getLocationCountry());
        locationToUpdate.setLocationWhenToGo(location.getLocationWhenToGo());
        entityManager.flush();
    }
 
    public void deleteLocation(long locationId) {
        entityManager.remove(selectLocationById(locationId));
    }
 
    public List<Location> selectAllLocation() {
        Query query = entityManager.createQuery("from Location as usr order by usr.locationId");
        return (List<Location>) query.getResultList();
    }
 
}
