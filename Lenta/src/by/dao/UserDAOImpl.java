package by.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import by.connect.DBUtil;
import by.entity.User;

public class UserDAOImpl implements UserDAO {

	private Connection conn;

	public UserDAOImpl() throws IOException, SQLException, PropertyVetoException, NamingException {
		conn = DBUtil.getConnection();

	}

	@Override
	public User logIn(String email, String password) {
		User user = new User(email, password);
		try {
			String query = "SELECT user_id, first_name, last_name, FROM user WHERE email=? AND password=?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				user.setUserId(resultSet.getInt("user_id"));
				user.setFirstName(resultSet.getString("first_name"));
				user.setLastName(resultSet.getString("last_name"));
			}
			resultSet.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
