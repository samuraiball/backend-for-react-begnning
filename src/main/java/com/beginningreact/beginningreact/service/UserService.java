package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Users;
import com.beginningreact.beginningreact.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public Users save(Users users){
      return   usersRepository.save(users);
    }

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    public void delete(Users users){
       usersRepository.delete(users);
    }

    public Users findOne(String id){
        return usersRepository.getOne(id);
    }
}
