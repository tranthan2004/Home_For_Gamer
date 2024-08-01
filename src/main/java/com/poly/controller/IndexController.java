package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poly.dao.ListAccountTradeDao;
import com.poly.entity.ListAccountTrade;

@Controller
public class IndexController {
	@Autowired
	ListAccountTradeDao TradeDao;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "/views/index";
	}
	@RequestMapping(value="/index/successPay", method=RequestMethod.GET)
	public String success() {
		return "/views/successPay";
	}
	@RequestMapping(value="/index/history", method=RequestMethod.GET)
	public String history() {
		return "/views/history";
	}
	@RequestMapping(value="/index/list", method=RequestMethod.GET)
	public String list(Model model) {
		List<ListAccountTrade> tradeacc = TradeDao.findAll();
		model.addAttribute("tradeAcc", tradeacc);
		return "/views/list";
	}
	@GetMapping("/DetailAccount/{id}")
    public String getProductDetail(@PathVariable("id") String id, Model model) {
        ListAccountTrade acc = TradeDao.findByNameaccount(id).get(0);
        model.addAttribute("acc", acc);
        return "/views/detail";
    }
}
