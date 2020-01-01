package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
	public int register(SysUser user);
	public int login(SysUser user);
	public int update(SysUser user);
}
