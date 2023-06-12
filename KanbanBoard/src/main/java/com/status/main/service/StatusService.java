package com.status.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.status.main.entity.Status;

@Service
public interface StatusService {

	public Status createStatus(Status status) throws Exception;

	public Status updateStatus(Status status) throws Exception;

	public List<Status> getAllStatus() throws Exception;
	
	//public Status getById(Integer id)throws Exception;
}
