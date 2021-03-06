package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Users;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;


@Dao
@ConfigAutowireable
public interface UsersRepository{
    @Select
    List<Users> findAll();
}
