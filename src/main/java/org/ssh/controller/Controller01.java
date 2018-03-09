package org.ssh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssh.pojo.Emp;
import org.ssh.service.EmpServiceI;

@Controller
public class Controller01 {

	@Resource
	private EmpServiceI es;

	/**
	 * ����5:03:58 2017��10��26��
	 */
	@RequestMapping("/abc")
	@ResponseBody
	public List<Emp> fun1() {
		List<Emp> el = es.selectAll();
		return el;

	}

}
