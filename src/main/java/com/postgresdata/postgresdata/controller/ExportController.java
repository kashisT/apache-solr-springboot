package com.postgresdata.postgresdata.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.postgresdata.postgresdata.model.Certification;
import com.postgresdata.postgresdata.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/export")
public class ExportController {

    @Autowired
    private CertificateRepository certificateRepository;

    @GetMapping("/certificates")
    public ResponseEntity<String> exportCertificates() {
        List<Certification> certificates = certificateRepository.findAll();

        ObjectMapper objectMapper = new ObjectMapper();
        String json;
        try {
            json = objectMapper.writeValueAsString(certificates);
        } catch (JsonProcessingException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
