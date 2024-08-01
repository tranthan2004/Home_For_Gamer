package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poly.dao.ListAccountTradeDao;
import com.poly.entity.ListAccountTrade;

@Controller
public class ListController {
	
	@Autowired
	ListAccountTradeDao TradeDao;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String List(Model model) {
		List<ListAccountTrade> tradeacc = TradeDao.findAll();
		System.out.println("Comments: " + tradeacc);
		model.addAttribute("tradeAcc", tradeacc);
		return "index";
	}
}
