package com.beginningreact.beginningreact.service;

import com.beginningreact.beginningreact.domain.Users;
import com.beginningreact.beginningreact.repository.UsersRepository;
import org.seasar.doma.jdbc.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    public Result<Users> save(Users users) {
        return usersRepository.insert(users);
    }
}
