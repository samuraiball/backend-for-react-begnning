package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Company;
import com.beginningreact.beginningreact.repository.CompanyRepository;
import org.seasar.doma.jdbc.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyService {
   @Autowired
    CompanyRepository companyRepository;

   public Company getOne(int companyId){
       return companyRepository.getOne(companyId);
   }

   public Result<Company> save(Company company){
       return companyRepository.insert(company);
   }
}
