package com.RickMuriMil.Dao;

import com.RickMuriMil.model.User;

public interface UserDao {
	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}
