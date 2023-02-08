import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao (Config config) {

        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException e){
            throw new RuntimeException("Error connecting to database!", e);
        }

    }

    //IntelliJ Auto Generated overides
    @Override
    public List<Ad> all() {
        return null;
    }
    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
