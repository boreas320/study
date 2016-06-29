package org.boreas.study.httpclienttest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by boreas320 on 16/6/30.
 */
public class Dao {

    private Connection connection;
    public Dao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root");
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void save(String content) throws SQLException {
        Statement statement = connection.createStatement();
        boolean execute = statement.execute("insert into xss values('" + content + "')");
        connection.commit();
    }

    public List<String> list() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from xss ");

        List<String> strings = new ArrayList<>();
        while (resultSet.next()) {
            String string = resultSet.getString(1);
            strings.add(string
            );
        }
        return strings;
    }

}
