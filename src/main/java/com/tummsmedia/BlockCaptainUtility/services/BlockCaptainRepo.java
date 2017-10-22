package com.tummsmedia.BlockCaptainUtility.services;

import com.tummsmedia.BlockCaptainUtility.entities.BlockCaptain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

/**
 * Created by john.tumminelli on 10/22/17.
 */
public interface BlockCaptainRepo extends CrudRepository<BlockCaptain, Integer> {
    Iterable<BlockCaptain> findFirstById(int id);

}
