package com.liveasy.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.liveasy.entites.*;



@Service
public interface LoadServices {
	
	
	public List<load> getLoads(long ShipperId);
	
	public load getLoad(long loadId);
	
	public load addLoad(load Load);
	
	public void deleteLoad(long loadId);

}
