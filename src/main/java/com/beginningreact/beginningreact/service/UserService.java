package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Users;
import com.beginningreact.beginningreact.repository.UsersRepository;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> findAll(){
      return   usersRepository.findAll();
    }
}
