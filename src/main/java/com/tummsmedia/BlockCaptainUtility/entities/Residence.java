package com.tummsmedia.BlockCaptainUtility.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.tumminelli on 9/26/17.
 */
@Entity
@Table(name = "residences")
public class Residence {
    @Id
    @GeneratedValue
    private int id;
    @Column (nullable = true)
    private int houseNumber;
    @Column (nullable = true)
    private String street;
    @Column(name = "address")
    private String address;
    @OneToMany
    @JoinColumn(name = "addressId")
    private List<Occupant> associatedOccupants = new ArrayList<>();




    public Residence() {
    }

    public Residence(int id, int houseNumber, String street, String address, List<Occupant> associatedOccupants) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.street = street;
        this.address = address;
        this.associatedOccupants = associatedOccupants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Occupant> getAssociatedOccupants() {
        return associatedOccupants;
    }

    public void setAssociatedOccupants(List<Occupant> associatedOccupants) {
        this.associatedOccupants = associatedOccupants;
    }
}
