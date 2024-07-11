package com.poly.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.entity.ListAccountRent;
import com.poly.entity.ListAccountTrade;

import java.util.HashMap;


@Service
public interface AccountService {
	
	List<ListAccountRent> findAllRent();
	
	List<ListAccountTrade> findAllTrade();
	

}