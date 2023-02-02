package com.postgresdata.postgresdata.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@Builder
public class Capability {

    @Id
    @SequenceGenerator(name = "capability_seq", sequenceName = "capability_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "capability_seq")
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "capability")
    private List<Certification> certifications;
}
