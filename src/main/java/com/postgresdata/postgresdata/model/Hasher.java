package com.postgresdata.postgresdata.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Builder
public class Hasher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "detailed_profile_ID")
    private DetailedProfile detailedProfile;

    @OneToOne
    private BasicProfile basicProfile;
}