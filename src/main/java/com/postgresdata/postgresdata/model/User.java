package com.postgresdata.postgresdata.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    private BasicProfile basicProfile;

    @OneToMany(mappedBy = "user")
    private List<CertificateChampion> certificateChampions;

    @OneToOne
    private DetailedProfile detailedProfile;
}
