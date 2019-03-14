package com.kitesurfing.kite.entity;


import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import com.fasterxml.jackson.annotation.JsonFormat;
 
@Entity
@Table(name = "location_table")
public class Location {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "location_id")
    private long locationId;
 
    @Column(name = "location_name")
    private String locationName;
 
    @Column(name = "location_longitude")
    private long locationLongitude;
 
    @Column(name = "location_latitude")
    private long locationLatitude;
 
    @Column(name = "location_windprobability")
    private long locationWindProbability;
    
    @Column(name = "location_country")
    private String locationCountry;
    
    @Column(name = "location_whentogo")
    private String locationWhenToGo;
 
    public long getLocationId() {
        return locationId;
    }
 
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }
 
    public String getLocationName() {
        return locationName;
    }
 
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
 
    public long getLocationLongitude() {
        return locationLongitude;
    }
 
    public void setLocationLongitude(long locationLongitude) {
        this.locationLongitude = locationLongitude;
    }
 
    public long getLocationLatitude() {
        return locationLatitude;
    }
 
    public void setLocationLatitude(long locationLatitude) {
        this.locationLatitude = locationLatitude;
    }
 
    public long getLocationWindProbability() {
        return locationWindProbability;
    }
 
    public void setLocationWindProbability(long locationWindProbability) {
        this.locationWindProbability = locationWindProbability;
    }
    
    public String getLocationCountry() {
        return locationCountry;
    }
 
    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }
    
    public String getLocationWhenToGo() {
        return locationWhenToGo;
    }
 
    public void setLocationWhenToGo(String locationWhenToGo) {
        this.locationWhenToGo = locationWhenToGo;
    }
 
    @Override
    public String toString() {
        return "Location [locationId=" + locationId + ", locationName=" + locationName + ", locationLongitude=" + locationLongitude + ", locationLatitude="
                + locationLatitude + ", locationWindProbability=" + locationWindProbability + ", locationCountry=" + locationCountry + ", locationWhenToGo=" + locationWhenToGo + "]";
    }
 
}
