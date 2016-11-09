package com.sxx.dao;

import com.sxx.entity.User;

public interface UserMapper {
	public User getUserById(int id);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void delUser(int id);
	
}

