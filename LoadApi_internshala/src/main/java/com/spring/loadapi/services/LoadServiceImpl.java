package com.spring.loadapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.loadapi.dao.LoadDao;
import com.spring.loadapi.entities.Payload;

@Service
public class LoadServiceImpl implements LoadService{
	
	@Autowired
	private LoadDao loadDao;

	@Override
	public List<Payload> getLoads() {
		return loadDao.findAll();
	}

	@Override
	public Payload getLoad(long loadId) {
		return loadDao.findById(loadId).get();
	}

	@Override
	public Payload addLoad(Payload payload) {
		loadDao.save(payload);
		return payload;
	}

	@Override
	public Payload updateLoad(Payload payload, long loadId) {
		Payload existingLoad = loadDao.findById(loadId).orElse(null);

	    if (existingLoad != null) {
	        existingLoad.setLoadingPoint(payload.getLoadingPoint());
	        existingLoad.setUnloadingPoint(payload.getUnloadingPoint());
	        existingLoad.setProductType(payload.getProductType());
	        existingLoad.setTruckType(payload.getTruckType());
	        existingLoad.setNoOfTrucks(payload.getNoOfTrucks());
	        existingLoad.setWeight(payload.getWeight());
	        existingLoad.setComment(payload.getComment());
	        existingLoad.setShipperId(payload.getShipperId());

	        loadDao.save(existingLoad); // Save the updated payload
	    }

	    return existingLoad;
	}

	@Override
	public void deleteLoad(long parseLong) {
		Payload load= loadDao.findById(parseLong).get();
		loadDao.delete(load);
		
	}

	

}
