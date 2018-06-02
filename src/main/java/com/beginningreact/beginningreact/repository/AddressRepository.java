package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Address;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;


@Dao
@ConfigAutowireable
public interface AddressRepository {

    @Select
    Address getOne(String addressId);
}
