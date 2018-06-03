package com.beginningreact.beginningreact.dto;

import com.beginningreact.beginningreact.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    int Id;
    String name;
    String username;
    String email;
    AddressDto addressDto;
    String phone;
    String website;
}
