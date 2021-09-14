package com.springboot.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{

	
   public List<UserEntity> findByUserLogin(String userLogin);
   public List<UserEntity> findByUserLoginContaining(String userLogin);

}
