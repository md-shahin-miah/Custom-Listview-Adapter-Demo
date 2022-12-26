package com.yotech.arrayadapterdemo;

import java.util.ArrayList;

public class UserInfo {

	//please declare private data instead of public to ensure the privacy of data field of each class
	private String name;
	private String hometown;

	public UserInfo(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
	}

	//retrieve user's name
	public String getName(){
		return name;
	}

	//retrieve users' hometown
	public String getHometown(){
		return hometown;
	}

	public static ArrayList<UserInfo> getUsers() {
		ArrayList<UserInfo> userInfos = new ArrayList<UserInfo>();
		userInfos.add(new UserInfo("Shahin", "Sylhet"));
		userInfos.add(new UserInfo("Xihad", "Sylhet"));
		userInfos.add(new UserInfo("Shuvo ", "Sylhet"));
		userInfos.add(new UserInfo("Raju ", "Germany"));

		userInfos.add(new UserInfo("Shahin", "Sylhet"));
		userInfos.add(new UserInfo("Xihad", "Sylhet"));
		userInfos.add(new UserInfo("Shuvo ", "Sylhet"));

		userInfos.add(new UserInfo("Raju ", "Germany"));
		return userInfos;
	}
}
