package com.status.main.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.status.main.entity.Status;
import com.status.main.repository.StatusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StatusServiceImpl implements StatusService {
	
   
	
	@Autowired
	StatusRepository statusRepository;
	
	@Override
	public Status createStatus(Status status)throws Exception {
		return statusRepository.save(status);
	}

	
	public Status updateStatus(Status status)throws Exception {
		// TODO Auto-generated method stub
		return statusRepository.save(status);
	}

	@Override
	public List<Status> getAllStatus()throws Exception{
		// TODO Auto-generated method stub
		return statusRepository.findAll();
	}


	

}
