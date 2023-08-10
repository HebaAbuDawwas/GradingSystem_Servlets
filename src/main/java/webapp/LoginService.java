package webapp;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import static constants.Constants.*;

public class LoginService {

	public Map<String, Integer> validateUser(String user, String password) throws SQLException, ClassNotFoundException {

		Class.forName(DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(JDBC_URL , JDBC_USER, JDBC_PASS);

		String usersSqlQuery= SELECT_STUDENTS_QUERY;
		try (PreparedStatement preparedStatement = connection.prepareStatement(usersSqlQuery)) {
			preparedStatement.setString(1, user);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if(resultSet.next()){
					String pass = resultSet.getString("password");
					if(pass.equals(password))
						return getMarksMap(user, connection);


				}
				return null;
			}
		}

	}

	private Map< String , Integer> getMarksMap(String user, Connection connection) throws SQLException {
		String sqlQuery = SELECT_MARKS_QUERY;
		Map< String , Integer> map = new HashMap<>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
			preparedStatement.setString(1, user);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					String course = resultSet.getString("course");
					int marks = resultSet.getInt("marks");
					map.put(course,marks);
				}

			}
		}
		connection.close();
		return map;


	}


}