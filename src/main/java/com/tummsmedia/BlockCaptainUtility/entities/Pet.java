package com.tummsmedia.BlockCaptainUtility.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.tumminelli on 10/26/17.
 */
@Entity
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue
    int petId;
    @Column
    String petName;

    private enum Species {
        DOG,
        CAT,
        BIRD,
        REPTILE,
        OTHER
    }
    @Column
    private Species species;
    @Column
    private boolean lostStatus = false;
    @Column
    private boolean useCaution;

    @ElementCollection
    @CollectionTable(name = "pet_images", joinColumns = @JoinColumn(name = "pet_id"))
    private List<Image> images = new ArrayList<>();



}
