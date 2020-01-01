package edu.swjtuhc.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Commodity;
import edu.swjtuhc.demo.service.CommodityService;
@RestController
@RequestMapping("/commodityController")
public class CommodityController {
		
	@Autowired
	CommodityService commodityService;
	
	@RequestMapping("/getList")
	public List<Commodity> getList(){
		return commodityService.getCommodityList();
	
	}
	
	@RequestMapping("/UploadPhoto")
	public int UploadPhoto(Commodity commodity,MultipartFile file) {
		System.out.println(commodity);
		System.out.println(file.getOriginalFilename());
		return 0;
	}
}
