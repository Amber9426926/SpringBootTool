package edu.swjtuhc.demo.controller;



import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Commodity;

import edu.swjtuhc.demo.service.CommodityService;
import net.sf.json.JSONObject;
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
	public JSONObject UploadPhoto(Commodity commodity,MultipartFile file) {
		JSONObject result = new JSONObject();
		System.out.println(commodity);
		System.out.println(file.getOriginalFilename());
		commodity.setPhoto(file.getOriginalFilename());
		int i = 0;
		try {
			
			i=commodityService.UploadPhoto(commodity,file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.put("state", i);
		
		return result;
	}
	@RequestMapping("/update")
	public JSONObject update(@RequestBody Commodity commodity) {
		JSONObject result = new JSONObject();
		
		int i = commodityService.update(commodity);
		
		result.put("state",i);
		return result;
	}
}
