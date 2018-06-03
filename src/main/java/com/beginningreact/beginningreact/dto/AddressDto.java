package com.beginningreact.beginningreact.dto;

import com.beginningreact.beginningreact.domain.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    int addressId;

    String street;

    String suite;

    String city;

    String zipcode;

    Geo geo;
}
