package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.swjtuhc.demo.mapper.SelectMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.SelectService;


@Service
public class SelectServiceImpl  implements SelectService {

	@Autowired
	SelectMapper selectMapper;	
	
	@Override
	public List<SysUser> getSelectList() {
		// TODO Auto-generated method stub
		return selectMapper.selectAllSysUser();
	}

	
}
