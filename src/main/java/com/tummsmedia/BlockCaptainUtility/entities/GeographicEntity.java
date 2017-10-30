package com.tummsmedia.BlockCaptainUtility.entities;

import com.google.gson.Gson;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

/**
 * Created by john.tumminelli on 10/24/17.
 */


@TypeDefs({

        @TypeDef(
                name = "int-array",
                typeClass = IntArrayType.class
        ),
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        )
})
@Entity(name = "dwgeo")
@Table(name = "dw_geo")
public class GeographicEntity{
    @Id
    @GeneratedValue
    private int geoId;
    @Column
    private String entity;
    @Type(type = "int-array")
    @Column(name = "path", columnDefinition = "integer[]")
    private int[] path;

    @ManyToOne
    @JoinColumn(name = "assigned_bc")
    private BlockCaptain assignedBc;


    public GeographicEntity() {
    }

    public GeographicEntity(int geoId, String entity, int[] path, BlockCaptain assignedBc) {
        this.geoId = geoId;
        this.entity = entity;
        this.path = path;
        this.assignedBc = assignedBc;
    }

    public GeographicEntity(String entity, BlockCaptain assignedBc) {
        this.entity = entity;
        this.assignedBc = assignedBc;
    }

    public int getGeoId() {
        return geoId;
    }

    public void setGeoId(int geoId) {
        this.geoId = geoId;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public int[] getPath() {
        return path;
    }

    public void setPath(int[] path) {
        this.path = path;
    }

    public BlockCaptain getAssignedBc() {
        return assignedBc;
    }

    public void setAssignedBc(BlockCaptain assignedBc) {
        this.assignedBc = assignedBc;
    }
}

