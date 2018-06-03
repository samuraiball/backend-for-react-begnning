package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Address;
import com.beginningreact.beginningreact.domain.Users;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;


@Dao
@ConfigAutowireable
public interface AddressRepository {

    @Select
    Address getOne(int addressId);

    @Insert
    Result<Address> insert(Address address);
}
