package edu.swjtuhc.demo.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
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
	@Override
	public int UploadPhoto(Commodity commodity,InputStream fileStream) {
		// TODO Auto-generated method stub
		String path = "D:\\localFiles\\";
		int i = -1;
		byte[] bs = new byte[1024];
		int len;
		try {
			File tempFile = new File(path);
			if(!tempFile.exists()) {
				tempFile.mkdirs();
			}
			
			Date today  =new Date();
			String fileName = today.getTime()+commodity.getPhoto();
			commodity.setPhoto("/Photo/+fileName");
			OutputStream os = new FileOutputStream(tempFile.getPath()+File.separator+fileName);
		//开始读取
			while((len = fileStream.read(bs)) !=-1) {
				os.write(bs,0,len);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			i = -2;
		}
		if(commodity.getPhoto().equals("")) {
			i= -3;
		}else {
			
			i=commodityMapper.insertCommodity(commodity);
		}
		
	return i;
	}
	 public int update(Commodity commodity) {
		 
		//TODO Auto-generated method stub
			Commodity user2 = commodityMapper.selectcommodityByName(commodity.getName());
			
			int i = -1;
			if(user2!=null) {
					i= commodityMapper.updatecommodityByName(commodity);
			}else {
				i=2;
			}
			return i;
			 
		 }
		
}
