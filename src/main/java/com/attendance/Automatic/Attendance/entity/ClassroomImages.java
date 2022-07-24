package com.attendance.Automatic.Attendance.entity;


import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "classroom_images", schema = "public")
public class ClassroomImages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Lob
    @Column(name = "photo", columnDefinition="BLOB")
    private Byte[] photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }
}


