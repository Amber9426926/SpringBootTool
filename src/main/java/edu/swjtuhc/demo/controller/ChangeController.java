package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.ChangeModel;
import edu.swjtuhc.demo.service.ChangeService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Change")
public class ChangeController {
	@Autowired
	ChangeService Changeservice;
	
	@RequestMapping("/updateuPwd")
	public JSONObject Change(@RequestBody ChangeModel changemodel) {
		JSONObject result = new JSONObject();
		int i = Changeservice.Change(changemodel);
		result.put("state",i);
		return result;
	}
}
