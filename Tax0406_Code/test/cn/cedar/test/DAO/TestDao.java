package cn.cedar.test.DAO;

import java.io.Serializable;

import cn.cedar.test.entity.Person;

public interface TestDao {
	// 保存人员
	public void save(Person person);

	// 根据ID查询人员
	public Person findPerson(Serializable id);
}
