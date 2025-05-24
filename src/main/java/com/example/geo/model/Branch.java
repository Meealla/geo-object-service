package com.example.geo.model;

import jakarta.persistence.Entity;
import lombok.Value;

@Entity
@Value
public class Branch {
    Long id;
    String name;
    Double latitude;
    Double longitude;
}
