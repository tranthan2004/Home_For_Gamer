package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poly.dao.UserAccountDao;
import com.poly.entity.UserAccount;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdminController {
	@Autowired
	UserAccountDao userAccDao;
	@RequestMapping(value="/index/admin")
	public String index(Model model) {
		UserAccount user = new UserAccount();
		user.setAdmin(false);
		user.setPassword("");
		user.setUsername("");
		user.setSeller(false);
		model.addAttribute("user", user);
		List<UserAccount> list = userAccDao.findAll();
		model.addAttribute("list", list);
		return "/views/admin";
	}
	@RequestMapping(value="/index/admin/edit/{username}", method=RequestMethod.GET)
	public String edit(@PathVariable("username")String u,Model model) {
		UserAccount user = userAccDao.findById(u).get();
		model.addAttribute("user",user);
		List<UserAccount> list = userAccDao.findAll();
		model.addAttribute("list", list);
		return "/views/admin";
	}
	@RequestMapping(value="/index/admin/create", method=RequestMethod.POST)
	public String create(UserAccount user,Model model) {
		System.out.println("Username"+userAccDao.existsById(user.getUsername()));
		if(userAccDao.existsById(user.getUsername())) {
			model.addAttribute("mes", "Username đã tồn tại");
			return "forward:/index/admin";
		} else {
			userAccDao.save(user);
		}
		return "redirect:/index/admin";
	}
	@RequestMapping(value="/index/admin/delete", method=RequestMethod.POST)
	public String delete(UserAccount user) {
		userAccDao.delete(user);
		return "redirect:/index/admin";
	}
	@RequestMapping(value="/index/admin/update/{username}", method=RequestMethod.POST)
	public String update(@PathVariable("username")String username,UserAccount user,Model model) {
		if(userAccDao.existsById(user.getUsername())) {
			userAccDao.save(user);
		} else {
			model.addAttribute("mes", "Username không tồn tại");
			return "/views/admin";
		}
		return "redirect:/index/admin";
	}
	
	
}
