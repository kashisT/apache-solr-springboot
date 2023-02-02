package com.postgresdata.postgresdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresdata.postgresdata.model.OfferedBy;

@Repository
@Deprecated
public interface OfferedByRepository extends JpaRepository<OfferedBy, Long>{
    
}
