package service;

import entity.Location;
import repository.LocationRepository;

import java.util.List;

public class LocationServiceImpl implements LocationService{

    LocationRepository repository;
    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int Id) {
        return repository.findById(Id).get();
    }

    @Override
    public List<Location> getAllLocation(Location location) {
        return repository.findAll();
    }
}
