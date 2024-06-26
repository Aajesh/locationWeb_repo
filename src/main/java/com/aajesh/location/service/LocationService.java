package com.aajesh.location.service;

public interface LocationService {
    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Location getLocationById(int id);

    List<Location> getAllLocations();
}
