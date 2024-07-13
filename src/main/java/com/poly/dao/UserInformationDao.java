package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.UserInformation;

public interface UserInformationDao extends JpaRepository<UserInformation, String> {

}
