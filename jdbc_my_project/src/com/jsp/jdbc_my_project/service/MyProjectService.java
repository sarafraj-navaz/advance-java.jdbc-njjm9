package com.jsp.jdbc_my_project.service;

import com.jsp.jdbc_my_project.dao.MyprojectDao;
import com.jsp.jdbc_my_project.dto.MyProject;

public class MyProjectService {
	
	MyprojectDao dao=new MyprojectDao();
	
	public  void savaByDao(MyProject myproject) {
	
		dao.savaByDao(myproject);
	}

}
