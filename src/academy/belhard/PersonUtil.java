package academy.belhard;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonUtil {

    public static Person buildPerson(ResultSet resultSet) {
        Person result = null;

        try {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String city = resultSet.getString("city");
            String address = resultSet.getString("address");
            String email = resultSet.getString("email");
            int age = resultSet.getInt("age");

            result = new Person(id, firstName, lastName, address, city, email, age);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
