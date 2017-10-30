package com.tummsmedia.BlockCaptainUtility.services;

import com.tummsmedia.BlockCaptainUtility.entities.GeographicEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static org.hibernate.hql.internal.antlr.SqlTokenTypes.IS;
import static org.postgresql.core.SqlCommandType.SELECT;

/**
 * Created by john.tumminelli on 10/24/17.
 */
public interface GeoEntityRepo extends CrudRepository<GeographicEntity, int[]>{
    GeographicEntity findFirstByPath(int[] pathId);
    GeographicEntity findFirstByGeoId(int geoId);


}
