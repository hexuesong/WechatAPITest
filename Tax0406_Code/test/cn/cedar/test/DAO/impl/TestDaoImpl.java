package cn.cedar.test.DAO.impl;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.cedar.test.DAO.TestDao;
import cn.cedar.test.entity.Person;

public class TestDaoImpl extends HibernateDaoSupport implements TestDao {
	
	//‘ˆº”
	@Override
	public void save(Person person) {
		getHibernateTemplate().save(person);
	}
	//≤È’“
	@Override
	public Person findPerson(Serializable id) {
		return getHibernateTemplate().get(Person.class, id);
	}

}
