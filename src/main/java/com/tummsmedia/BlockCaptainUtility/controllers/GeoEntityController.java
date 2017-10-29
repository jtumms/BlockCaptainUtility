package com.tummsmedia.BlockCaptainUtility.controllers;

import com.tummsmedia.BlockCaptainUtility.entities.GeographicEntity;
import com.tummsmedia.BlockCaptainUtility.services.GeoEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by john.tumminelli on 10/24/17.
 */
@RestController
public class GeoEntityController {

    @Autowired
    GeoEntityRepo geoEntities;

    @RequestMapping(value="/get-entity/{pathId}", method= RequestMethod.GET)
    @ResponseBody
    public GeographicEntity getGeoEntityByPath(@PathVariable("pathId")String pathId)
    {
        String[] pathIdStringArray = pathId.split(",");
        int[] pathIdIntArray = new int[pathIdStringArray.length];
        for (int i = 0; i < pathIdStringArray.length; i++){
            String numberAsString = pathIdStringArray[i];
            pathIdIntArray[i] = Integer.parseInt(numberAsString);
        }
        return geoEntities.findFirstByPath(pathIdIntArray);

    }
    @RequestMapping(value="/get-entity-by-id/{pathId}", method= RequestMethod.GET)
    @ResponseBody
    public GeographicEntity getGeoEntityById(@PathVariable("pathId")int pathId)
    {
        return geoEntities.findFirstByGeoId(pathId);

    }




}
