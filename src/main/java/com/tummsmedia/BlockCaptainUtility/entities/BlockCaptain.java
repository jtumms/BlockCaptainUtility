package com.tummsmedia.BlockCaptainUtility.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.tummsmedia.BlockCaptainUtility.services.BlockCaptainRepo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.tumminelli on 9/26/17.
 */

@Entity
@Table(name = "block_captains")
public class BlockCaptain {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String email;
    @Column(nullable = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String password;
    @Column(nullable = true)
    String address;
    @Column(nullable = true)
    String cellPhone;
    @Column(nullable =  true)
    String altPhone;
    @Column(nullable = true)
    String firstName;
    @Column(nullable = true)
    String lastName;
    @Column(nullable = true)
    String neighborhood;
    @Column(nullable = true)
    String addtionalInfo;
    @Column
    boolean cert;
    @Column
    boolean certInterest;
    @Column
    boolean medical;
    @Column
    boolean firstResponder;
    @Column
    boolean ham;
    @Column
    boolean chainsaw;
    @Column
    boolean generator;

    @OneToMany
    @JoinColumn(name = "bc_id")
    private List<Residence> assignedResidences = new ArrayList<>();
    @Transient
    int assignedResidenceCount;


    public BlockCaptain() {
    }


    public BlockCaptain(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public BlockCaptain(int id, String email, String password, String address, String cellPhone, String altPhone, String firstName, String lastName, String neighborhood, String addtionalInfo, boolean cert, boolean certInterest, boolean medical, boolean firstResponder, boolean ham, boolean chainsaw, boolean generator, List<Residence> assignedResidences, int assignedResidenceCount) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.address = address;
        this.cellPhone = cellPhone;
        this.altPhone = altPhone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.neighborhood = neighborhood;
        this.addtionalInfo = addtionalInfo;
        this.cert = cert;
        this.certInterest = certInterest;
        this.medical = medical;
        this.firstResponder = firstResponder;
        this.ham = ham;
        this.chainsaw = chainsaw;
        this.generator = generator;
        this.assignedResidences = assignedResidences;
        this.assignedResidenceCount = assignedResidenceCount;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public boolean isCert() {
        return cert;
    }

    public void setCert(boolean cert) {
        this.cert = cert;
    }

    public boolean isCertInterest() {
        return certInterest;
    }

    public void setCertInterest(boolean certInterest) {
        this.certInterest = certInterest;
    }

    public boolean isMedical() {
        return medical;
    }

    public void setMedical(boolean medical) {
        this.medical = medical;
    }

    public boolean isFirstResponder() {
        return firstResponder;
    }

    public void setFirstResponder(boolean firstResponder) {
        this.firstResponder = firstResponder;
    }

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    public boolean isChainsaw() {
        return chainsaw;
    }

    public void setChainsaw(boolean chainsaw) {
        this.chainsaw = chainsaw;
    }

    public boolean isGenerator() {
        return generator;
    }

    public void setGenerator(boolean generator) {
        this.generator = generator;
    }

    public List<Residence> getAssignedResidences() {
        return assignedResidences;
    }

    public int getAssignedResidenceCount() {
        return assignedResidenceCount;
    }

    public void setAssignedResidences(List<Residence> assignedResidences) {
        this.assignedResidences = assignedResidences;
    }

    public void setAssignedResidenceCount(int size) {
        assignedResidenceCount = assignedResidences.size();


    }
}
