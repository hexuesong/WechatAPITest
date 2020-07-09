package cn.cedar.nsfw.user.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private String id;
	// 所属部门
	private String dept;
	// 账号
	private String account;
	// 用户名
	private String name;
	// 密码
	private String password;
	// 头像相对路径
	private String headImg;
	// 性别
	private boolean gender;
	// 状态
	private String state;
	// 手机号
	private String mobile;
	// 邮箱
	private String email;
	// 生日
	private Date birthday;
	// 备注
	private String memo;

	public User() {
	}

	public User(String id, String dept, String account, String name, String password, String headImg, boolean gender,
			String state, String mobile, String email, Date birthday, String memo) {
		super();
		this.id = id;
		this.dept = dept;
		this.account = account;
		this.name = name;
		this.password = password;
		this.headImg = headImg;
		this.gender = gender;
		this.state = state;
		this.mobile = mobile;
		this.email = email;
		this.birthday = birthday;
		this.memo = memo;
	}

	// 用户状态
	public static String USER_STATE_VALID = "1";// 有效
	public static String USER_STATE_INVALID = "0";// 有效

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
