package com.sample.service;

import com.sample.model.User;

public interface SampleService {
	public void register(User user);
	public User login(User user);
}
