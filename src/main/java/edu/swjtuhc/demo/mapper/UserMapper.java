package edu.swjtuhc.demo.mapper;


import org.apache.ibatis.annotations.Mapper;


import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public SysUser selectuserByuName(String uName);
	public int insertUser(SysUser user);
	public SysUser selectuserByuPwd(String uPwd);
	public int insertLogin(SysUser user);
	public int updateuserByuPwd(SysUser user);
	
}