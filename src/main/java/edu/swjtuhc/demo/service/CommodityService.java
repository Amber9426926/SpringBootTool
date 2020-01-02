package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Commodity;

public interface CommodityService {
	public List<Commodity> getCommodityList();
	
	public int UploadPhoto(Commodity commodity,InputStream fileStream);
	public int update(Commodity commodity);
}
