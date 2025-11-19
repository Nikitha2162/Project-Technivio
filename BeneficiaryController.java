package com.onlinebanking.controller;

import com.onlinebanking.model.Beneficiary;
import com.onlinebanking.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/beneficiaries")
public class BeneficiaryController {

    @Autowired
    private BeneficiaryService beneficiaryService;

    @GetMapping
    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryService.getAllBeneficiaries();
    }

    @GetMapping("/{id}")
    public Beneficiary getBeneficiaryById(@PathVariable Long id) {
        return beneficiaryService.getBeneficiaryById(id);
    }

    @PostMapping
    public Beneficiary addBeneficiary(@RequestBody Beneficiary beneficiary) {
        return beneficiaryService.addBeneficiary(beneficiary);
    }

    @DeleteMapping("/{id}")
    public String deleteBeneficiary(@PathVariable Long id) {
        return beneficiaryService.deleteBeneficiary(id);
    }
}
