package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public JSONObject register(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		
		int i = userService.register(user);
		
		result.put("state",i);
		return result;
	}
	@RequestMapping("/login")
	public JSONObject login(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		
		int i = userService.login(user);
		
		result.put("state",i);
		return result;
	}
	@RequestMapping("/update")
	public JSONObject update(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		int i = userService.update(user);
		
		result.put("state",i);
		return result;
	}
	@RequestMapping("/delete")
	public JSONObject delete(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		int i = userService.delete(user);
		
		result.put("state",i);
		return result;
	}
}
