package com.status.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.status.main.entity.Status;
import com.status.main.service.StatusService;

@RestController
@RequestMapping("/myStatus")
public class MyController {

	
	@Autowired
	StatusService statusService;
	
	

	@PostMapping("/addStatus")//POST//localhost:4444/myStatus/addStatus
	public Status createStatus(@RequestBody Status status) throws Exception{
		try {
			return statusService.createStatus(status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	@PutMapping("/updateStatus") //PUT//localhost:4444/myStatus/updateStatus
	
	public Status updateStatus(@RequestBody Status status) throws Exception {
		
		return statusService.updateStatus(status);
		
	}
	
	
	@GetMapping("/viewallstatus") //GET//localhost:4444/myStatus/viewallstatus
	
	public List<Status> getallStatus() throws Exception {
		
		return statusService.getAllStatus();
		
	}
}


