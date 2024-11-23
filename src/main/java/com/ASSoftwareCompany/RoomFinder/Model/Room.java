package com.ASSoftwareCompany.RoomFinder.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private double rent;
    private String description;

    @ManyToOne
    private User owner; // Owner of the room
}
