package com.beginningreact.beginningreact.api;

import com.beginningreact.beginningreact.domain.Address;
import com.beginningreact.beginningreact.domain.Company;
import com.beginningreact.beginningreact.domain.Geo;
import com.beginningreact.beginningreact.domain.Users;
import com.beginningreact.beginningreact.dto.UserDto;
import com.beginningreact.beginningreact.service.AddressService;
import com.beginningreact.beginningreact.service.CompanyService;
import com.beginningreact.beginningreact.service.UserService;
import org.seasar.doma.Select;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersRestController {

    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @Autowired
    CompanyService companyService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<UserDto> getUser() {


        List<Users> userlist = userService.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        userlist.forEach(users -> {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(users, userDto);
            userDto.setAddressDto(addressService.getOne(users.getAddressId()));
            userDtoList.add(userDto);
        });
        return userDtoList;
    }

    @PostMapping(path = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public Users create(@Validated @RequestBody Users users, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new RuntimeException();
        }

            Address createdAddress = addressService.save(new Address()).getEntity();
            Company createdCompany = companyService.save(new Company()).getEntity();
            users.setAddressId(createdAddress.getAddressId());
            users.setCompanyId(createdCompany.getCompanyId());
            return userService.save(users).getEntity();
    }

   @InitBinder
   public void initBinder(WebDataBinder binder){
        binder.setAllowedFields(
                "Id",
                "name",
                "username",
                "email",
                "phone",
                "website"
        );
   }
}