package com.tummsmedia.BlockCaptainUtility.controllers;

import com.tummsmedia.BlockCaptainUtility.entities.BlockCaptain;
import com.tummsmedia.BlockCaptainUtility.services.BlockCaptainRepo;
import com.tummsmedia.BlockCaptainUtility.utilities.PasswordStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by john.tumminelli on 10/22/17.
 */

@RestController
public class BlockCaptainController {

    @Autowired
    BlockCaptainRepo blockCaptains;

    @RequestMapping(path = "/login)", method = RequestMethod.POST)
    public ResponseEntity<Object> postLogin(HttpSession session, @RequestBody BlockCaptain bc) throws PasswordStorage.InvalidHashException, PasswordStorage.CannotPerformOperationException {
        BlockCaptain bcDatabase = blockCaptains.findFirstByEmail(bc.getEmail());
        if (bcDatabase == null) {
            return new ResponseEntity<Object>("User does not exist", HttpStatus.FORBIDDEN);
        }
        else if (!com.tummsmedia.BlockCaptainUtility.utilities.PasswordStorage.verifyPassword(bc.getPassword(), bcDatabase.getPassword())){
            return new ResponseEntity<Object>("Incorrect password", HttpStatus.FORBIDDEN);

        }
        session.setAttribute("username", bc.getEmail());
        return new ResponseEntity<Object>(bcDatabase, HttpStatus.OK);

    }

    @RequestMapping(value = "/get-user/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getBc(@PathVariable("id")int id) {
        if (blockCaptains.findFirstById(id) == null) {
            HashMap<String, String> hm = new HashMap();
            hm.put("result", "no results found");
            return new ResponseEntity<Object>(hm, HttpStatus.OK);
        }
        BlockCaptain bc = blockCaptains.findFirstById(id);
        bc.setAssignedResidenceCount(bc.getAssignedResidences().size());
        BlockCaptain extendedBc = new BlockCaptain(bc.getId(),
                bc.getEmail(),
                bc.getPassword(),
                bc.getAddress(),
                bc.getCellPhone(),
                bc.getAltPhone(),
                bc.getFirstName(),
                bc.getLastName(),
                bc.getNeighborhood(),
                bc.getAddtionalInfo(),
                bc.isCert(),
                bc.isCertInterest(),
                bc.isMedical(),
                bc.isFirstResponder(),
                bc.isHam(),
                bc.isChainsaw(),
                bc.isGenerator(),
                bc.getAssignedResidences(),
                bc.getAssignedResidenceCount());
        return new ResponseEntity<Object>(extendedBc, HttpStatus.OK);



    }

    @RequestMapping(path = "/bc.json", method = RequestMethod.GET)
    public Iterable<BlockCaptain> getBlockCaptains() {
        return blockCaptains.findAll();
    }

}





