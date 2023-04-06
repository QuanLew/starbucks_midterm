package com.example.springjpa;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User,Integer>{
}
