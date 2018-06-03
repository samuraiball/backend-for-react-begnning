package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Geo;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

@Dao
@ConfigAutowireable
public interface GeoRepository {
    @Select
    Geo getOne(int geoId);

    @Insert
    Result<Geo> insert(Geo geo);
}
