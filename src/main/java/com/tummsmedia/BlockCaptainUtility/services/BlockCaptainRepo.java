package com.tummsmedia.BlockCaptainUtility.services;

import com.tummsmedia.BlockCaptainUtility.entities.BlockCaptain;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by john.tumminelli on 10/22/17.
 */
public interface BlockCaptainRepo extends CrudRepository<BlockCaptain, Integer> {
    BlockCaptain findFirstById(int id);
    BlockCaptain findFirstByEmail(String email);



}
