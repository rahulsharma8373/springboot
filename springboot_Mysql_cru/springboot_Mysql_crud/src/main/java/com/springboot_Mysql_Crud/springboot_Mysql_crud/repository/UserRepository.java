package com.springboot_Mysql_Crud.springboot_Mysql_crud.repository;

import com.springboot_Mysql_Crud.springboot_Mysql_crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository  extends JpaRepository<User, Integer> {
}
