package by.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.connect.DBUtil;
import by.entity.News;

public class NewsDAOImpl implements NewsDAO {
	private Connection conn;

	public NewsDAOImpl() {
		conn = DBUtil.getConnection();

	}

	@Override
	public List<News> getAllNews() {
		List<News> allNews = new ArrayList<News>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM news");
			while (resultSet.next()) {
				News news = new News();
				news.setNewsId(resultSet.getInt(1));
				news.setName(resultSet.getString(2));
				news.setAnnotation(resultSet.getString(3));
				news.setAuthorId(resultSet.getInt(4));
				news.setDate(resultSet.getDate(5).toLocalDate());
				news.setText(resultSet.getString(6));
				news.setCategoryId(resultSet.getInt(7));
				allNews.add(news);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allNews;
	}

}
