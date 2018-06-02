package com.beginningreact.beginningreact.dto;

import com.beginningreact.beginningreact.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    String Id;
    String username;
    String email;
    Address address;
    String phone;
    String website;


}
