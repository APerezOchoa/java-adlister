import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection = null;

    public List<Ads> MySQLAdsDao (Config config) {

        String selectQuery = "SELECT * FROM ads";

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

    //Unfinished
    @Override
    public List<Ads> all() {
        Statement stmt = null;
        try{
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            return createAdsFromResults(rs);
        } catch (SQLException e){
            throw new RuntimeException("Error retrieving all ads!", e);
        }
    }
    @Override
    //not my work
    public Long insert(Ad ad) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return .rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad!", e);
        }
    }
    private String createInsertQuery(Ad ad){

    }
    private Ad extractAd(ResultSet rs) throws SQLException{

    }
    /////ONE MORE METHOD GOES HERE
    private
}
