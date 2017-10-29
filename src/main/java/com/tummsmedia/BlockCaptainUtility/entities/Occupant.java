package com.tummsmedia.BlockCaptainUtility.entities;

import com.tummsmedia.BlockCaptainUtility.hibernate.JsonDataUserType;
import com.vladmihalcea.hibernate.type.array.IntArrayType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by john.tumminelli on 10/26/17.
 */
@Entity(name = "occupants")
@Table(name = "occupants")
@TypeDef(name = "JsonDataUserType", typeClass = JsonDataUserType.class)
public class Occupant {
    @Id
    @GeneratedValue
    int occupantId;
    @Column
    private String occupantFirstName;
    @Column
    private String occupantLastName;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String relationship;
    @Column
    boolean vacationStatus = false;
    @Column
    boolean renter = false;

    @Type(type = "JsonDataUserType")
    @Column(name = "additional_data")
    private Map<String, String > otherData;
    @Column
    private String additionalInfo;
    @ElementCollection
    @CollectionTable(name = "occupant_images", joinColumns = @JoinColumn(name = "occupant_id"))
    private List<Image> images = new ArrayList<>();
//    @Type(type = "json")
//    @Column(name = "phone_one", columnDefinition = "json")
//    private Phone phoneOne;


    public Occupant() {
    }

    public Occupant(int occupantId, String occupantFirstName, String occupantLastName, String email, String address, String relationship, boolean vacationStatus, boolean renter, Map otherData, String additionalInfo, List<Image> images, HashMap<String, String> objectsToJavaMap) {
        this.occupantId = occupantId;
        this.occupantFirstName = occupantFirstName;
        this.occupantLastName = occupantLastName;
        this.email = email;
        this.address = address;
        this.relationship = relationship;
//        this.phoneOne = phoneOne;
//        this.phoneTwo = phoneTwo;
//        this.phoneThree = phoneThree;
        this.vacationStatus = vacationStatus;
        this.renter = renter;
        this.otherData = otherData;
        this.additionalInfo = additionalInfo;
        this.images = images;
    }

    public int getOccupantId() {
        return occupantId;
    }

    public void setOccupantId(int occupantId) {
        this.occupantId = occupantId;
    }

    public String getOccupantFirstName() {
        return occupantFirstName;
    }

    public void setOccupantFirstName(String occupantFirstName) {
        this.occupantFirstName = occupantFirstName;
    }

    public String getOccupantLastName() {
        return occupantLastName;
    }

    public void setOccupantLastName(String occupantLastName) {
        this.occupantLastName = occupantLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

//    public Phone getPhoneOne() {
//        return phoneOne;
//    }
//
//    public void setPhoneOne(Phone phoneOne) {
//        this.phoneOne = phoneOne;
//    }
//
//    public Phone getPhoneTwo() {
//        return phoneTwo;
//    }
//
//    public void setPhoneTwo(Phone phoneTwo) {
//        this.phoneTwo = phoneTwo;
//    }
//
//    public Phone getPhoneThree() {
//        return phoneThree;
//    }
//
//    public void setPhoneThree(Phone phoneThree) {
//        this.phoneThree = phoneThree;
//    }

    public boolean isVacationStatus() {
        return vacationStatus;
    }

    public void setVacationStatus(boolean vacationStatus) {
        this.vacationStatus = vacationStatus;
    }

    public boolean isRenter() {
        return renter;
    }

    public void setRenter(boolean renter) {
        this.renter = renter;
    }

    public Map getOtherData() {
        return otherData;
    }

    public void setOtherData(Map otherData) {
        this.otherData = otherData;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }


}
