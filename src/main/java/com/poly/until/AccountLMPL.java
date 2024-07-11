package com.poly.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.poly.dao.ListAccountRentDao;
import com.poly.dao.ListAccountTradeDao;
import com.poly.entity.ListAccountRent;
import com.poly.entity.ListAccountTrade;

public class AccountLMPL {
	@Autowired
	private ListAccountRentDao Daorent;
	
	@Autowired
	private ListAccountTradeDao Daotrade;
	
	private List<ListAccountRent> CartRent = new ArrayList<>();
	
	private List<ListAccountTrade> CartTrade = new ArrayList<>();
	
	
}
