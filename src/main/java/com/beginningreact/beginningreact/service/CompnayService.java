package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Company;
import com.beginningreact.beginningreact.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompnayService {
   @Autowired
    CompanyRepository companyRepository;

   public Company getOne(String companyId){
       return companyRepository.getOne(companyId);
   }
}
