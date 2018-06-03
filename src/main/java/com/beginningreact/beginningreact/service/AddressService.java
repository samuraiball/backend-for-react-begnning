package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Address;
import com.beginningreact.beginningreact.domain.Geo;
import com.beginningreact.beginningreact.dto.AddressDto;
import com.beginningreact.beginningreact.repository.AddressRepository;
import com.beginningreact.beginningreact.repository.GeoRepository;
import org.seasar.doma.jdbc.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    GeoRepository geoRepository;

    public AddressDto getOne(int addressId) {
        AddressDto addressDto = new AddressDto();
        Address address = addressRepository.getOne(addressId);
        BeanUtils.copyProperties(address,addressDto);
        addressDto.setGeo(geoRepository.getOne(address.getGeoId()));
        return addressDto;
    }

    public Result<Address> save(Address address){
        Geo createdGeo = geoRepository.insert(new Geo()).getEntity();
        address.setGeoId(createdGeo.getGeoId());
        return addressRepository.insert(address);
    }
}
