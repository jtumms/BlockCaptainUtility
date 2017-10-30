package com.tummsmedia.BlockCaptainUtility.controllers;

import com.tummsmedia.BlockCaptainUtility.entities.Occupant;
import com.tummsmedia.BlockCaptainUtility.entities.Residence;
import com.tummsmedia.BlockCaptainUtility.services.ResidenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john.tumminelli on 10/29/17.
 */
@RestController
public class ResidenceController {
    @Autowired
    ResidenceRepo residences;

    @RequestMapping(path = "/residence", method = RequestMethod.GET)
    public Residence getResidence(@RequestParam("address")String address){
       return residences.findFirstByAddress(address);

    }
}
