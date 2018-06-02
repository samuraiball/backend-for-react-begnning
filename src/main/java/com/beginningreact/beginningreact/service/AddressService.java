package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Address;
import com.beginningreact.beginningreact.domain.Geo;
import com.beginningreact.beginningreact.repository.AddressRepository;
import com.beginningreact.beginningreact.repository.GeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    GeoRepository geoRepository;

    public Address getOne(String addressId) {
        Address address = addressRepository.getOne(addressId);
        address.setGeo(geoRepository.getGeo(address.getGeoId()));
        return address;
    }
}
