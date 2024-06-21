package com.sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Batch {
	@Autowired
	
	private List<String> studentNames;
	
	public List<String> getStudentNames(){
		return studentNames;
	}

}
