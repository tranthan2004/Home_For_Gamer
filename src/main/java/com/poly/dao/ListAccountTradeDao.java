package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.entity.ListAccountRent;
import com.poly.entity.ListAccountTrade;

public interface ListAccountTradeDao extends JpaRepository<ListAccountTrade, String> {
	List<ListAccountTrade> findByNameaccount(String nameaccount);
}
