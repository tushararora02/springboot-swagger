package com.demo.repository;

import com.demo.entity.UserEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository  {
    public UserEntity findById(String userId);
}
