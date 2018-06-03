package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Company;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;


@Dao
@ConfigAutowireable
public interface CompanyRepository {
    @Select
    Company getOne(int companyId);

    @Insert
    Result<Company> insert(Company company);

}
