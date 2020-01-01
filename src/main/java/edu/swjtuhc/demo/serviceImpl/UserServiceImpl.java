package edu.swjtuhc.demo.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public int register(SysUser user) {
		//TODO Auto-generated method stub
		SysUser user1 = userMapper.selectuserByuName(user.getuName());
		
		int i = -1;
		if(user1==null) {
			i = userMapper.insertUser(user);
			
		}else {
			i = 2;
		}
		return i;
	}
	public int login(SysUser user) {
		//TODO Auto-generated method stub
		SysUser user2 = userMapper.selectuserByuName(user.getuName());
		SysUser user3 = userMapper.selectuserByuPwd(user.getuPwd());
		int i = -1;
		if(user2==null) {
				i = 1;
		}else if(user2!=null&&user3!=null) {
			i = 2;
		}else {
			i=3;
		}
		return i;
	}
	public int update(SysUser user) {
		//TODO Auto-generated method stub
		SysUser user2 = userMapper.selectuserByuPwd(user.getuName());
		SysUser user3 = userMapper.selectuserByuPwd(user.getuPwd());
		int i = -1;
		if(user2!=null&&user3!=null) {
				user.setuPwd(user.getNuPwd());
				return userMapper.updateuserByuPwd(user);
		}else {
			i=2;
		}
		return i;
	}
}
