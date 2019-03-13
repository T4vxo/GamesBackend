package nu.te4.gamesbackend.utilities;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author DanLun2
 */
public class ConnectionFactory {

    public static Connection make() throws Exception {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/<database>";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection(url, username, password);
        return connection;
    }

}
