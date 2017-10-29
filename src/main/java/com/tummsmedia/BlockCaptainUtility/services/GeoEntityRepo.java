package com.tummsmedia.BlockCaptainUtility.services;

import com.tummsmedia.BlockCaptainUtility.entities.GeographicEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by john.tumminelli on 10/24/17.
 */
public interface GeoEntityRepo extends CrudRepository<GeographicEntity, int[]>{
    GeographicEntity findFirstByPath(int[] pathId);
    GeographicEntity findFirstByGeoId(int geoId);

}
