package com.demo.service;

import com.demo.entity.UserEntity;
import com.demo.model.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User findByUserId(String userId) {
        User user=new User();
        UserEntity userEntity=userRepository.findById(userId);

        if(userEntity!=null){
            user.setUserId(userEntity.getUserId());
            user.setEmail(userEntity.getEmail());
            user.setName(userEntity.getName());
        }
        return user;
    }


}
