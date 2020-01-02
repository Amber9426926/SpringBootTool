package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface SelectMapper {
	public List<SysUser>selectAllSysUser();
}
