package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.poly.dao.UserAccountDao;
import com.poly.dao.UserInformationDao;
import com.poly.entity.UserAccount;
import com.poly.entity.UserInformation;

import jakarta.servlet.annotation.HttpConstraint;

@Controller
public class SignupController {
	@Autowired
	UserAccountDao UserDao;
	
	List<UserAccount> account;
	
	@RequestMapping(value = "/index/signup", method = RequestMethod.GET)
	public String show() {
		return "/views/signup";
	}

	@RequestMapping(value = "/index/signup", method = RequestMethod.POST)
	public String create(Model model, @RequestParam("user") String username, @RequestParam("pass") String pw,
			@RequestParam("passconfirm") String pwconfirm) {
		if (username.isBlank()||pw.isBlank()||pwconfirm.isBlank()) {
			model.addAttribute("mes", "Vui lòng điền đầy đủ thông tin");
		} else {
			account = UserDao.findAll();
			for (UserAccount acc : account) {
				if (acc.getUsername().equals(username)) {
					model.addAttribute("mes", "Username đã tồn tại");
					return "/views/signup";
				} else if (!pw.equals(pwconfirm)){
					model.addAttribute("mes", "Mật khẩu không trùng khớp");
					return "/views/signup";
				} else {
					UserAccount a = new UserAccount();
					a.setUsername(username);
					a.setPassword(pw);
					a.setAdmin(false);
					a.setSeller(true);
					UserDao.save(a);
					model.addAttribute("mes", "Đăng kí thành công!");
				}
			}
		}
		return "/views/signup";
	}
}
