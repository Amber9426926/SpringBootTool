package edu.swjtuhc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/register")
	public JSONObject register(SysUser user) {
		JSONObject result = new JSONObject();
		
		return null;
	}
	
}
