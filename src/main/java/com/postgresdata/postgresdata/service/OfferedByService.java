package com.postgresdata.postgresdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresdata.postgresdata.model.OfferedBy;
import com.postgresdata.postgresdata.repository.OfferedByRepository;

@Service
@Deprecated
public class OfferedByService {

    @Autowired
    OfferedByRepository offeredByRepository;

    public OfferedBy save(OfferedBy offeredBy) {

        return offeredByRepository.save(offeredBy);

    }
    
}
