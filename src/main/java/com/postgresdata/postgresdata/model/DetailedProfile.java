package com.postgresdata.postgresdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class DetailedProfile {

    @Id
    private Long id;

    private String delEmail;

    @OneToOne(mappedBy = "detailedProfile")
    private User user;
}