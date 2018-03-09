package org.ssh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssh.dao.EmpDaoI;
import org.ssh.pojo.Emp;

@Service
public class EmpServiceI {

	@Resource
	private EmpDaoI ed;
	
	public List<Emp> selectAll() {
		
		return ed.selectAll();
	}

	
	 
	
}
