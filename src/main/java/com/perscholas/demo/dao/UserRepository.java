package com.perscholas.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.perscholas.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
