package com.aajesh.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LocationRepository extends JpaRepository<Location, Integer> {
}
