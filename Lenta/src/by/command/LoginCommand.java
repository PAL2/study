package by.command;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;

import by.dao.NewsDAO;
import by.dao.NewsDAOImpl;
import by.dao.UserDAO;
import by.dao.UserDAOImpl;
import by.entity.User;
import by.command.ConfigurationManager;
import by.command.MessageManager;

public class LoginCommand implements ActionCommand {
	private UserDAO dao;
	private NewsDAO dao2;
	private static final String PARAM_NAME_MAIL = "email";
	private static final String PARAM_NAME_PASSWORD = "password";

	public LoginCommand() {
		try {
			dao = new UserDAOImpl();
			dao2 = new NewsDAOImpl();
		} catch (IOException | SQLException | PropertyVetoException | NamingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String execute(HttpServletRequest request) {
		String page = null;
		String email = request.getParameter(PARAM_NAME_MAIL);
		String password = request.getParameter(PARAM_NAME_PASSWORD);

		try {
			User user = dao.logIn(email, password);
			request.getSession().setAttribute("user", user);
			page = ConfigurationManager.getProperty("path.page.allnews");
			request.setAttribute("allNews", dao2.getAllNews());
		} catch (NullPointerException e) {
			request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
			page = ConfigurationManager.getProperty("path.page.login");
		}
		return page;
	}

}
