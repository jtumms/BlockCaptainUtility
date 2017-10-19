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








}
