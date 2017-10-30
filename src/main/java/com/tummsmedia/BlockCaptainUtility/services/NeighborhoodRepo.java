package com.tummsmedia.BlockCaptainUtility.services;

import com.tummsmedia.BlockCaptainUtility.entities.GeographicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by john.tumminelli on 10/29/17.
 */
public interface NeighborhoodRepo extends JpaRepository<GeographicEntity, Integer> {
    @Query(value = "SELECT * FROM dw_geo WHERE assigned_bc IS NOT NULL and path[1] = ?1", nativeQuery = true)
    Iterable<GeographicEntity> findByPathArrayNeighborhoodElement(int id);
}

