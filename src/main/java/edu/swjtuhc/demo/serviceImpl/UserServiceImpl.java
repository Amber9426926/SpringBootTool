package edu.swjtuhc.demo.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	
	@Override
	public int register(SysUser user) {
		//TODO Auto-generated method stub
		
		return 0;
	}
	
}
