package com.quanwugou.springmvc.service.impl;

import com.quanwugou.springmvc.service.ITestService;

public class TestServiceImpl implements ITestService {

	@Override
	public void save(String name) {

		System.out.println("����save����");
		// throw new RuntimeException();
	}

	@Override
	public void update(String name, Integer id) {

		System.out.println("����update()����");
	}

	@Override
	public String getPersonName(Integer id) {

		System.out.println("����getPersonName()����");
		return "xxx";
	}

}
