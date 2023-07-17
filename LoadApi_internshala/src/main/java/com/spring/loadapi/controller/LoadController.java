package com.spring.loadapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.loadapi.entities.Payload;
import com.spring.loadapi.services.LoadService;

@RestController
public class LoadController {
	@Autowired
	private LoadService loadService;
	
	//get the courses
	
	@GetMapping("/load")
	public List<Payload> getLoads(){
		return this.loadService.getLoads();
	}
	
	@GetMapping("/load/{loadId}")
	public Payload getLoad(@PathVariable String loadId) {
		return this.loadService.getLoad(Long.parseLong(loadId));
	}
	//Add course
	@PostMapping("/load")
	public Payload addLoad(@RequestBody Payload payload) {
		return this.loadService.addLoad(payload);
	}
	//Update course
	@PutMapping("/load/{loadId}")
	public Payload updateLoad(@RequestBody Payload payload, @PathVariable String loadId) {
		return this.loadService.updateLoad(payload, Long.parseLong(loadId));
	}
	
	//delete Course
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.loadService.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
