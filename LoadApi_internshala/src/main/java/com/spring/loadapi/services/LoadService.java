package com.spring.loadapi.services;

import java.util.List;

import com.spring.loadapi.entities.Payload;

public interface LoadService {

	public List<Payload> getLoads();
	
	public Payload getLoad(long loadId);
	
	public Payload addLoad(Payload payload);
	
	public Payload updateLoad(Payload payload,long loadId);
	
	public void deleteLoad(long parseLong);
}
