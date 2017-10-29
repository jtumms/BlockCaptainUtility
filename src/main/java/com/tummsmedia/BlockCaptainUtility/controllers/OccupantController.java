package com.tummsmedia.BlockCaptainUtility.controllers;

import com.google.gson.JsonObject;
import com.tummsmedia.BlockCaptainUtility.entities.Occupant;
import com.tummsmedia.BlockCaptainUtility.services.OccupantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by john.tumminelli on 10/26/17.
 */
@RestController
public class OccupantController {

    @Autowired
    OccupantRepo occupants;

    @RequestMapping(path = "/occupants", method = RequestMethod.GET)
    public Occupant getOccupant(@RequestParam("id")int id){
        Occupant occupant = occupants.findFirstByOccupantId(id);
        return occupant;

    }


}
