package com.poly.controller;

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
public class DetailController {
	@Autowired
	ListAccountTradeDao TradeDao;
	@RequestMapping(value="/index/detail", method=RequestMethod.GET)
	public String detail() {
		return "/views/detail";
	}
	@GetMapping("/pay/{id}")
	public String pay(@PathVariable("id") String id, Model model) {
        ListAccountTrade acc = TradeDao.findByNameaccount(id).get(0);
        model.addAttribute("acc", acc);
        return "/views/pay";
    }
}
