package com.tummsmedia.BlockCaptainUtility.services;

import com.tummsmedia.BlockCaptainUtility.entities.Occupant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by john.tumminelli on 10/26/17.
 */
public interface OccupantRepo extends CrudRepository<Occupant, Integer>  {
    Occupant findFirstByOccupantId(int occupantId);
    Iterable<Occupant> findByOccupantLastName(String lastName);
}
