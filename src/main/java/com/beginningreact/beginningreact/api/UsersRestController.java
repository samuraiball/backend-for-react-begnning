package com.beginningreact.beginningreact.api;

import com.beginningreact.beginningreact.domain.Address;
import com.beginningreact.beginningreact.domain.Geo;
import com.beginningreact.beginningreact.domain.Users;
import com.beginningreact.beginningreact.dto.UserDto;
import com.beginningreact.beginningreact.service.AddressService;
import com.beginningreact.beginningreact.service.UserService;
import org.seasar.doma.Select;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class UsersRestController {

    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("users")
    public List<UserDto> getUser() {


        List<Users> userlist = userService.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        userlist.forEach(users -> {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(users,userDto);
            userDto.setAddressDto(addressService.getOne(users.getAddressId()));
            userDtoList.add(userDto);
        });
        return userDtoList;
    }

    @PostMapping(path = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public Users create(@RequestBody Users users) {
        return null;
    }
}