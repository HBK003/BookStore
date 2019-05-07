package com.sample.dao;

import com.sample.model.User;

public interface SampleDAO {
	public void register(User user);
	public User login(User user);
}
