package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Commodity;




@Mapper
public interface CommodityMapper {
	public List<Commodity>selectAllCommodity();
	public int insertCommodity(Commodity commodity);
	public int updatecommodityByName(Commodity commodity);
	public 	Commodity selectcommodityByName(String uName);
}
