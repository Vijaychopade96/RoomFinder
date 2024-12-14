package com.ASSoftwareCompany.RoomFinder.Model;

import jakarta.persistence.*;

import lombok.Data;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class RoomOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactNumber;
//    private Blob image;

//    @OneToMany(mappedBy = "roomOwner", cascade = CascadeType.ALL)
//    private List<Room> rooms;

    @OneToMany(mappedBy = "roomOwner", cascade = CascadeType.ALL)
    private List<Room> rooms = new ArrayList<>();
}
