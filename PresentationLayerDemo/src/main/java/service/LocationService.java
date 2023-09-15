package service;

import entity.Location;

import java.util.List;

public interface LocationService {
    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationById(int Id);
    List<Location> getAllLocation(Location location);
}
