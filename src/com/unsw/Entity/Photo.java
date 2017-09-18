package com.unsw.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Photo {
    private int photoId;

    @Id
    @Column(name = "photo_id", nullable = false)
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        if (photoId != photo.photoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return photoId;
    }
}
