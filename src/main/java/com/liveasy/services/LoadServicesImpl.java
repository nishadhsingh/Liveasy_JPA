package com.liveasy.services;
import com.liveasy.entites.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.dao.*;
@Service
public class LoadServicesImpl implements LoadServices{
	
	@Autowired
	private Dao data ;
	
	
	
	@Override
	public List<load> getLoads(long ShipperId){
		return data.findByShipperIdEquals(ShipperId);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public load getLoad(long loadId) {
		return data.findById(loadId).get();
		
	}
	
	
	@Override
	public load addLoad(load Load) {
		
		return data.save(Load);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void deleteLoad (long loadID) {
		load entity = data.getOne(loadID);
		data.delete(entity);
		
	}
	

}
