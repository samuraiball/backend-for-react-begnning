package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.seasar.doma.*;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(immutable = true, naming = NamingType.LENIENT_SNAKE_LOWER_CASE)
@Data
@Table(name = "geo")
@AllArgsConstructor
@NoArgsConstructor
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
}


