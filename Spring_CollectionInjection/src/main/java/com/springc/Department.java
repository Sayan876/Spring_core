package com.springc;

import java.util.*;

public class Department {
	private Properties dept_details;
	private Set<Integer> emp_ids;
	private List<String> emp_names;
	private Map<Integer, String> emp_detials;

	

	

	public Properties getDept_details() {
		return dept_details;
	}

	public void setDept_details(Properties dept_details) {
		this.dept_details = dept_details;
	}

	

	public Set<Integer> getEmp_ids() {
		return emp_ids;
	}

	public void setEmp_ids(Set<Integer> emp_ids) {
		this.emp_ids = emp_ids;
	}

	public List<String> getEmp_names() {
		return emp_names;
	}

	public void setEmp_names(List<String> emp_names) {
		this.emp_names = emp_names;
	}

	public Map<Integer, String> getEmp_detials() {
		return emp_detials;
	}

	public void setEmp_detials(Map<Integer, String> emp_detials) {
		this.emp_detials = emp_detials;
	}

}
