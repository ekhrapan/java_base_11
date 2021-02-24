package academy.belhard;

import java.sql.*;

public class PersonConnector {

    private static final String SELECT_BY_ID = "SELECT * FROM persons WHERE id = ?";
    private static final String INSERT = "INSERT INTO persons (first_name, last_name, address, city, email, age) VALUES(?, ?, ?, ?, ?, ?)";

    public static Person byId(int id) {
        Connection connection = DbConnectionProvider.getConnection();

        Person result = null;

        try (
                PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID)
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            resultSet.next();
            result = PersonUtil.buildPerson(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void save(Person person) {
        Connection connection = DbConnectionProvider.getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(INSERT)
        ) {
            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getLastName());
            statement.setString(3, person.getAddress());
            statement.setString(4, person.getCity());
            statement.setString(5, person.getEmail());
            statement.setInt(6, person.getAge());

            int changed = statement.executeUpdate();
            System.out.println("Changed items:" + changed);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
