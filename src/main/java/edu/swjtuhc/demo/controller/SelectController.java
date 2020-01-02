package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.SelectService;

@RestController
@RequestMapping("/UserAdministration")
public class SelectController {
	
	@Autowired
	SelectService selectService;

	@RequestMapping("/getList")
	public List<SysUser> getList(){
		return selectService.getSelectList();
	}
	
}
