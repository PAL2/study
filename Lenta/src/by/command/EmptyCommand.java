package by.command;

import javax.servlet.http.HttpServletRequest;

import by.command.ActionCommand;
import by.command.ConfigurationManager;

public class EmptyCommand implements ActionCommand {

	@Override
	public String execute(HttpServletRequest request) {
		String page = ConfigurationManager.getProperty("path.page.login");
		return page;
	}

}
