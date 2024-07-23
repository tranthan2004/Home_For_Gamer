package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
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
	public String list() {
		return "/views/list";
	}
}
