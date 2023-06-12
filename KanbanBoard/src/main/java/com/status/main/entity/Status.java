package com.status.main.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Status {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	
	@Enumerated(EnumType.STRING)
	private Progress progress;
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status(int id, String title, Progress progress) {
		super();
		this.id = id;
		this.title = title;
		this.progress = progress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Progress getProgress() {
		return progress;
	}

	public void setProgress(Progress progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "Status [  title=" + title + ", progress=" + progress + "]";
	}
	
	
	
}
