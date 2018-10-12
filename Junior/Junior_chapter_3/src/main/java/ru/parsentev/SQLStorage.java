package ru.parsentev;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;

public class SQLStorage {
    private static final Logger log = LoggerFactory.getLogger(SQLStorage.class);

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/java_a_to_z";
        String username = "postgres";
        String password = "";

        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url, username, password);
//            PreparedStatement st = conn.prepareStatement("insert into users (login, password, create_date) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            PreparedStatement st = conn.prepareStatement("delete from users where id = ?");

//            st.setString(1, "new java user 2");
            st.setInt(1, 6);
//            st.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            /*ResultSet generatedKeys = st.getGeneratedKeys();
            if (generatedKeys.next()) {
                System.out.println(generatedKeys.getInt(1));
            }*/

//            PreparedStatement st = conn.prepareStatement("SELECT * FROM users as u where u.id in (?, ?, ?)");
//            st.setInt(1,2);
//            st.setInt(2,1);
//            st.setInt(3,3);
//            ResultSet rs = st.executeQuery();
//            while (rs.next())
//            {
//                System.out.println(String.format("%s, %s", rs.getString("login"), rs.getString("create_date")));
//            } rs.close();
//            st.close();

        } catch (Exception e){
            log.error(e.getMessage(), e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }

    }
}
