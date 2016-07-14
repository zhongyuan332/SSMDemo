package com.edu.ccut.service;

import java.util.List;

import com.edu.ccut.pojo.Person;

/**
 *@author zhongyuan
 *@date 2016年7月12日
 */
public interface IPersonService {
	public boolean savePerson(Person p);
	public List<Person> getAllPerson();
	public boolean updatePerson(Person p);
	public Person getPerson(Integer id);
}
