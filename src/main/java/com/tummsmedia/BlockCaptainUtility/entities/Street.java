package com.tummsmedia.BlockCaptainUtility.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by john.tumminelli on 10/23/17.
 */
@Embeddable
public class Street {


    private String streetName;

    public Street() {
    }

    public Street(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
