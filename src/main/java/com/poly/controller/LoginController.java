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
	public String login(Model model,@RequestParam("user")Optional<String> user,@RequestParam("pass")Optional<String> pass) {
		String u = user.orElse(null);
		String p = pass.orElse("");
		UserAccount us = dao.findById(u).get();
		if(us!=null) {
			if (us.getPassword().equals(pass)) {
				model.addAttribute("message","Login Success!");
				return "redirect:/index/login";
			} else {
				model.addAttribute("message", "Incorrect Password!");
				return "redirect:/index/login";
			}		
		} else {
			model.addAttribute("message", "User Invalid!");
//			return "redirect:/index/login";
		}
		
		model.addAttribute("message", "Thanh cong!");
		return "/views/login";
	}
	@RequestMapping(value="/index/signup", method=RequestMethod.GET)
	public String signup() {
		return "/views/signup";
	}
	
}
