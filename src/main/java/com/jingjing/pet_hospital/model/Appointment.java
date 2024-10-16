package com.jingjing.pet_hospital.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;

    private String reason;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    // Getters and Setters

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for dateTime
    public Date getDateTime() {
        return dateTime;
    }

    // Setter for dateTime
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    // Getter for reason
    public String getReason() {
        return reason;
    }

    // Setter for reason
    public void setReason(String reason) {
        this.reason = reason;
    }

    // Getter for pet
    public Pet getPet() {
        return pet;
    }

    // Setter for pet
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
