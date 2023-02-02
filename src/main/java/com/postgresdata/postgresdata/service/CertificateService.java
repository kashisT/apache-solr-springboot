package com.postgresdata.postgresdata.service;

import com.postgresdata.postgresdata.model.Certification;
import com.postgresdata.postgresdata.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {

    @Autowired
    CertificateRepository certificateRepository;

    public Certification saveCertificate(Certification certification) {
        
        return certificateRepository.save(certification);
    }
}
