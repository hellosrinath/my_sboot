package com.srinath.crud_operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinath.crud_operation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
