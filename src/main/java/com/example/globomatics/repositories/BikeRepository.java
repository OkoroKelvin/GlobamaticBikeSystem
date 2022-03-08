package com.example.globomatics.repositories;

import com.example.globomatics.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long> {

}
