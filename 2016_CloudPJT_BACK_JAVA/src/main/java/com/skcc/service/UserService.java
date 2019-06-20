package com.skcc.service;

import com.skcc.domain.user.User;

public interface UserService {
	public User getUserByUsername(String username);
}
