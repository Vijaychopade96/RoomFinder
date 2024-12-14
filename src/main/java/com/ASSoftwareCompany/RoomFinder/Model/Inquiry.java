package com.ASSoftwareCompany.RoomFinder.Model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long roomOwnerId;
    private String clientName;
    private String clientContact;
    private String message;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
