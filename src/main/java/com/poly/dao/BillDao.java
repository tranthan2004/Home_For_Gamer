package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.Bill;

public interface BillDao extends JpaRepository<Bill, String> {

}
