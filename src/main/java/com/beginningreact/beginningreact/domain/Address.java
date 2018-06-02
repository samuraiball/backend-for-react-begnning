package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Data
@Table
public class Address {

    @Id
    String addressId;

    @Column
    String street;

    @Column
    String suite;

    @Column
    String city;

    @Column
    String zipcode;

    @Column
    String geoId;

    Geo geo;

}

