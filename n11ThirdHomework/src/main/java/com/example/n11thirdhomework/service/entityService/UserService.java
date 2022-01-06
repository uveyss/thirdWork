package com.example.n11thirdhomework.service.entityService;

import com.example.n11thirdhomework.entity.UserEntity;
import com.example.n11thirdhomework.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

@Autowired
    UserRepository userRepository;

public List<UserEntity> findAll()
{
    return  userRepository.findAll();
}

public UserEntity findById(String id)
{
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if(userEntity.isPresent())
    {
        return userEntity.get();
    }
    return null;
}

public UserEntity save(UserEntity userEntity)
{
    userEntity=userRepository.save(userEntity);
    return userEntity;
}

public void deleteById(String userId)
{
    userRepository.deleteById(userId);
}

}
