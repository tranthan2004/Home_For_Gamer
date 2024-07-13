package com.poly.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.BillDetail;

public interface BillDetailDao extends JpaRepository<BillDetail, String> {

}
