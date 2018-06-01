package com.beginningreact.beginningreact.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
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


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "lat")
    Geo geo;
}

