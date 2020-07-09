package cn.cedar.nsfw.user.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cedar.nsfw.user.dao.UserDao;
import cn.cedar.nsfw.user.entity.User;
import cn.cedar.nsfw.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(Serializable id) {
		userDao.delete(id);
	}

	@Override
	public User findByObjectById(Serializable id) {

		return userDao.findByObjectById(id);
	}

	@Override
	public List<User> findObjects() {

		return userDao.findObjects();
	}

}
