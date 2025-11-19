package com.onlinebanking.service;

import com.onlinebanking.model.Beneficiary;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BeneficiaryService {

    private Map<Long, Beneficiary> beneficiaries = new HashMap<>();
    private Long idCounter = 1L;

    public List<Beneficiary> getAllBeneficiaries() {
        return new ArrayList<>(beneficiaries.values());
    }

    public Beneficiary getBeneficiaryById(Long id) {
        return beneficiaries.get(id);
    }

    public Beneficiary addBeneficiary(Beneficiary beneficiary) {
        beneficiary.setId(idCounter++);
        beneficiaries.put(beneficiary.getId(), beneficiary);
        return beneficiary;
    }

    public String deleteBeneficiary(Long id) {
        beneficiaries.remove(id);
        return "Beneficiary removed successfully.";
    }
}