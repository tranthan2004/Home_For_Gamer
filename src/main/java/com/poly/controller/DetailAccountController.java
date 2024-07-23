package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailAccountController {
	@RequestMapping(value="/index/detailAccount", method=RequestMethod.GET)
	public String detailAccount() {
		return "/views/detailAccount";
	}
	
}
