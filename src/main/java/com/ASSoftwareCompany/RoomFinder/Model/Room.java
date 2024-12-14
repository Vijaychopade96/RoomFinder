package com.ASSoftwareCompany.RoomFinder.Model;

import jakarta.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private double rent;
    private String description;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private RoomOwner roomOwner;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Inquiry> inquiries;
}
