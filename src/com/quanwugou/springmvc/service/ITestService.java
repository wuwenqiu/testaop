package com.quanwugou.springmvc.service;

public interface ITestService {

	public void save(String name);

	public void update(String name, Integer id);

	public String getPersonName(Integer id);
}
