package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.UserAccount;

public interface UserAccountDao extends JpaRepository<UserAccount, String> {

}
