package com.sample.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.SampleDAO;
import com.sample.model.User;
@Service("sampleSerive")
public class SampleServiceImpl  implements SampleService {
	@Autowired
	private SampleDAO sampleDAO;
 @Override
 @Transactional
 public void register(User user) {
	 sampleDAO.register(user);
 }
 public User login(User user) {
	 return sampleDAO.login(user);
 }
}
