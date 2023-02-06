package com.postgresdata.postgresdata.service;

import com.postgresdata.postgresdata.model.CertificateChampion;
import com.postgresdata.postgresdata.model.Certification;
import com.postgresdata.postgresdata.model.CertifiedHashersSummary;
import com.postgresdata.postgresdata.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CertificateService {

    @Autowired
    CertificateRepository certificateRepository;

    @Autowired
    CertificationProviderService certificationProviderService;

    @Autowired
    CertificateChampionService certificateChampionService;

    @Autowired
    CertifiedHashersSummaryService certifiedHashersSummaryService;

    public Certification saveCertificate(Certification certification) {
        certification.setOfferedBy(certificationProviderService.save(certification.getOfferedBy()));
        List<CertificateChampion> champions = new ArrayList<>();
        for (CertificateChampion c :certification.getCertificateChampions()){
            champions.add(certificateChampionService.saveCertificateChampion(c));
        }
        certification.setCertificateChampions(champions);
        certifiedHashersSummaryService.saveCertifiedHashersSummary(certification.getCertifiedHashersSummary());
        return certificateRepository.save(certification);
    }

    public List<Certification> getCertificate() {

        List<Certification> l = certificateRepository.findAll();
        return l;
    }


}
