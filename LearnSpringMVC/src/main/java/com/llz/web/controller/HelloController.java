package com.llz.web.controller;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/user/{userid}")
	public void printUser(@PathVariable("userid") String userid,
			@RequestParam("param") String param,
			@RequestHeader("host") String host, Writer writer)
			throws IOException {
		writer.write("userid:" + userid + "_param:" + param + "_host:" + host);

	}

	@RequestMapping("/user/login")
	@ResponseBody
	public String printLogin(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		return "username:" + username + "<br />_password:" + password;
	}

	@RequestMapping("/user/login2")
	public String printUser(@RequestParam("username") String username,
			@RequestParam("password") String password, ModelMap map) {
		map.addAttribute("name", username);
		map.addAttribute("password", password);
		return "user";

	}

	@RequestMapping("/user/login1")
	public User printLogin1(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
}