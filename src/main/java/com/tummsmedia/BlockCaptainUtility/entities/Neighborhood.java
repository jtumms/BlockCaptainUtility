package com.tummsmedia.BlockCaptainUtility.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john.tumminelli on 10/23/17.
 */

@Entity
@Table(name = "neighborhoods")
public class Neighborhood {
    @Id
    @GeneratedValue
    private int neighborhoodId;

    @Column
    private String neighborhoodName;

    @Column
    private String dunesWestNeighborhoodId;

    @ElementCollection
    @CollectionTable(name = "street_names", joinColumns = @JoinColumn(name = "neighborhoodId"))
    private List<Street> streets = new ArrayList<>();

    public Neighborhood() {
    }

    public Neighborhood(int neighborhoodId, String neighborhoodName, String dunesWestNeighborhoodId, List<Street> streets) {
        this.neighborhoodId = neighborhoodId;
        this.neighborhoodName = neighborhoodName;
        this.dunesWestNeighborhoodId = dunesWestNeighborhoodId;
        this.streets = streets;
    }

    public int getNeighborhoodId() {
        return neighborhoodId;
    }

    public void setNeighborhoodId(int neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public String getDunesWestNeighborhoodId() {
        return dunesWestNeighborhoodId;
    }

    public void setDunesWestNeighborhoodId(String dunesWestNeighborhoodId) {
        this.dunesWestNeighborhoodId = dunesWestNeighborhoodId;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
