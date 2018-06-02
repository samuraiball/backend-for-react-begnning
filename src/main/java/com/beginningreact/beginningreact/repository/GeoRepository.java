package com.beginningreact.beginningreact.repository;

import com.beginningreact.beginningreact.domain.Geo;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface GeoRepository {
    @Select
    Geo getGeo(String lat);
}
