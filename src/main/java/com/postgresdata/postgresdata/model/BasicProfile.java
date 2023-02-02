package com.postgresdata.postgresdata.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@RequiredArgsConstructor
@Builder
public class BasicProfile {

    @Id
    @SequenceGenerator(name = "basic_profile_seq", sequenceName = "basic_profile_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basic_profile_seq")
    private Long id;
    private String name;
    private String profilePic;
    @OneToOne
    private User user;
}
