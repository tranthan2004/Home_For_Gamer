package com.poly.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.UserAccountDao;
import com.poly.entity.UserAccount;


@Controller
public class LoginController {
	@Autowired
	UserAccountDao dao;
	@RequestMapping(value="/index/login")
	public String loginindex(Model model) {
		return "/views/login";
	}
	@RequestMapping(value="/index/login",method = RequestMethod.POST)
	public String login(Model model,@RequestParam("user")Optional<String> username,@RequestParam("pass")Optional<String> pass) {
		String u = username.orElse(null);
		String p = pass.orElse("");
		Optional<UserAccount> us = dao.findById(u);
		UserAccount user = us.orElse(null);
		if(user!=null) {
			if (user.getPassword().equals(p)) {
				return "redirect:/index";
			} else {
				model.addAttribute("mes", "Incorrect Password!");
				return "/views/login";
			}		
		} else {
			model.addAttribute("mes", "User Invalid!");
		}
		return "/views/login";
	}

}
