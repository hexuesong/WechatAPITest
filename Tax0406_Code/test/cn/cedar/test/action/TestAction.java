package cn.cedar.test.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import cn.cedar.test.service.TestService;

public class TestAction extends ActionSupport {
	@Resource
	TestService testService;
	public String execute() {
		testService.say();
		return SUCCESS;
	}
}
