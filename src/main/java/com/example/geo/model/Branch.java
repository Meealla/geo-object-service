package com.example.geo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Entity
@Value
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @NotBlank
    String name;
    @NotNull
    Double latitude;
    @NotNull
    Double longitude;
}
