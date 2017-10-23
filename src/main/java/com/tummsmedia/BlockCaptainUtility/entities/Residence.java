package com.tummsmedia.BlockCaptainUtility.entities;

import javax.persistence.*;

/**
 * Created by john.tumminelli on 9/26/17.
 */
@Entity
@Table(name = "residences")
public class Residence {
    @Id
    @GeneratedValue
    private String id;
    @Column (nullable = true)
    private int houseNumber;
    @Column (nullable = true)
    private String street;

    public Residence() {
    }

    public Residence(String id, int houseNumber, String street) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.street = street;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


}
