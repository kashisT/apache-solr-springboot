package com.postgresdata.postgresdata.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
public class CertifiedHashersSummary {
    @Id
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Hasher> hashersCertified;

    private int count;

    private boolean isCertified;

    private boolean isEnrolled;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Enrollment enrollment;
}