package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PayController {
	@RequestMapping(value="/index/payment", method=RequestMethod.GET)
	public String pay() {
		return "/views/pay";
	}
	
}
