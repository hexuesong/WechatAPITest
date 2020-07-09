package cn.cedar.test.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cedar.test.DAO.TestDao;
import cn.cedar.test.entity.Person;
import cn.cedar.test.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	@Resource
	TestDao testDao;

	@Override
	public void say() {
		System.out.println("Service say hi.");
	}

	@Override
	public void save(Person person) {
		testDao.save(person);
	}

	@Override
	public Person findPerson(Serializable id) {
		save(new Person("test"));
		return testDao.findPerson(id);
	}
	
}
