package com.newmemo.newmemo.repository;

import com.newmemo.newmemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
