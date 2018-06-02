package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Company;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface CompanyRepository {
    @Select
    Company getOne(String companyId);
}
