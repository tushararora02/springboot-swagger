package com.demo.repository;
import com.demo.repository.UserRepository;
import com.demo.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

    public UserEntity findById(String userId){
        UserEntity userEntity=new  UserEntity();
        userEntity.setUserId("usid");
        userEntity.setName("ram");
        userEntity.setEmail("abc@outlook.com");
        userEntity.setPassword("#####");
        return userEntity;
    }

}