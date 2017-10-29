package com.tummsmedia.BlockCaptainUtility.entities;

import javax.persistence.Embeddable;

/**
 * Created by john.tumminelli on 10/26/17.
 */
@Embeddable
public class Image {
    private String imageFileName;

    public Image() {
    }

    public Image(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}