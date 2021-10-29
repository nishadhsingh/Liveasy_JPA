package com.liveasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.liveasy.services.LoadServices;
import com.liveasy.entites.*;

import java.util.List;
import java.util.Random;
import java.util.Random.*;

@RestController
public class LoadController {
	@Autowired(required = false)
	LoadServices service;
	
	
	@GetMapping("/home")
	public String response() {
		return "hello";
	}
	
	
	public Random rgen = new Random(00000000000000);
	@PostMapping("/load")
	public load addLoadDetails(@RequestBody load Load){
		Load.setLoadid(rgen.nextLong());
		return service.addLoad(Load);
	}
	
	
	
	  @GetMapping("/load")
	  public List<load> getShipper(@RequestParam String ShipperId){ 
		  return service.getLoads(Long.parseLong(ShipperId)); }
	 
	//TODO: Finished
	@GetMapping(value = "/load/{loadId}")
	public load getLoad(@PathVariable String loadId ){
		return service.getLoad(Long.parseLong(loadId));
	}
	//TODO: Finished
	@PutMapping("/load/{loadId}")
	public load setLoad(@PathVariable String loadId,@RequestBody load Load ){
		Load.setLoadid(Long.parseLong(loadId));
		return service.addLoad(Load);
	}
	
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable String loadId){
		service.deleteLoad(Long.parseLong(loadId));
	}
		
	}
	
	
	


