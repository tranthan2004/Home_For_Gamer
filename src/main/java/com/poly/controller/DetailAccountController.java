package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poly.entity.UserAccount;
import com.poly.entity.UserInformation;

import jakarta.servlet.http.HttpSession;

@Controller
public class DetailAccountController {
	@Autowired
	HttpSession ses;
	@RequestMapping(value="/index/detailAccount", method=RequestMethod.GET)
	public String detailAccount() {
		UserAccount user = (UserAccount) ses.getAttribute("user");
		String un = user.getUsername();
		
		return "/views/detailAccount";
	}
	
}
