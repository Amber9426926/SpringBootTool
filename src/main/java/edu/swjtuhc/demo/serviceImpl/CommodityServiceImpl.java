package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.CommodityMapper;
import edu.swjtuhc.demo.model.Commodity;
import edu.swjtuhc.demo.service.CommodityService;

@Service
public class CommodityServiceImpl implements CommodityService {

	@Autowired
	CommodityMapper commodityMapper;
	
	@Override
	public List<Commodity> getCommodityList(){
		// TODO Auto-generated method stub
		return commodityMapper.selectAllCommodity();
	}
		
}
