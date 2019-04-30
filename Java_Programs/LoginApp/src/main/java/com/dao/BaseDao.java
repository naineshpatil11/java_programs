package com.dao;

import com.model.Users;

public interface BaseDao 
{
	public boolean login(String username,String password);
	public Users register(Users user);
	public boolean forgot(String username,String password);
}

