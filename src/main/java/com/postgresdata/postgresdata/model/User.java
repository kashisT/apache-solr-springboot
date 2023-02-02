package com.postgresdata.postgresdata.model;

import jakarta.persistence.*;

import java.util.List;

public class User {

    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;
    @OneToOne
    @JoinColumn(name = "basicProfile_id")
    private BasicProfile basicProfile;
    @OneToMany(mappedBy = "user")
    private List<CertificateChampion> certificateChampions;
}
