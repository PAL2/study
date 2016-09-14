package by.dao;

import by.entity.User;

public interface UserDAO {
	public User logIn(String email, String password);

}
