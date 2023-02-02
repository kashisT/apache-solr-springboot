package com.postgresdata.postgresdata.controller;

import com.postgresdata.postgresdata.model.Certification;
import com.postgresdata.postgresdata.service.CertificateService;
import com.postgresdata.postgresdata.service.OfferedByService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController {

    @Autowired
    CertificateService certificateService;

    @Autowired
    OfferedByService offeredByService;

    @PostMapping("/save")
    ResponseEntity<Certification> saveCertificate(@RequestBody Certification certification) {
        certification = certificateService.saveCertificate(certification);
        return ResponseEntity.status(HttpStatus.CREATED).body(certification);
    }
}
