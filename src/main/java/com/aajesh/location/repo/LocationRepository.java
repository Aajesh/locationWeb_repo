package com.aajesh.location.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LocationRepository extends CrudRepository<Location, Integer> {
}
