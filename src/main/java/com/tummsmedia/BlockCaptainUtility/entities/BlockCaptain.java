package com.tummsmedia.BlockCaptainUtility.entities;


import javax.persistence.*;

/**
 * Created by john.tumminelli on 9/26/17.
 */

@Entity
@Table(name = "block_captains")
public class BlockCaptain {

    @Id
    @GeneratedValue
    int userId;

    @Column(nullable = false)
    String username;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    int houseNumber;
    @Column(nullable = false)
    String street;
    @Column(nullable = false)
    String city;
    @Column(nullable = false)
    String state;
    @Column(nullable = false)
    int zipcode;
    @Column(nullable = true)
    String cellPhone;
    @Column(nullable =  true)
    String altPhone;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;
    @Column(nullable = true)
    String neighborhood;
    @Column(nullable = true)
    String addtionalInfo;

    public BlockCaptain() {
    }

    public BlockCaptain(int userId, String username, String password, int houseNumber, String street, String city, String state, int zipcode, String cellPhone, String altPhone, String firstName, String lastName, String neighborhood, String addtionalInfo) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.cellPhone = cellPhone;
        this.altPhone = altPhone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.neighborhood = neighborhood;
        this.addtionalInfo = addtionalInfo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAltPhone() {
        return altPhone;
    }

    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddtionalInfo() {
        return addtionalInfo;
    }

    public void setAddtionalInfo(String addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }
}
