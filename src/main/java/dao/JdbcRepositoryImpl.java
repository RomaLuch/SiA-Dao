/*
package dao;

import model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

*/
/**
 * Created by ���� on 01.07.2017.
 *//*

@Repository("jdbcrep")
public class JdbcRepositoryImpl implements Rep {
    private static final String SQL_INSERT_SPITTER =
            "insert into spitter (username, password, fullname) values (?, ?, ?)";
    @Autowired
    private DataSource dataSource;

    public void addSpitter(Spitter spitter) {

        try(Connection conn = dataSource.getConnection(); //
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT_SPITTER,new String[]{"IDUSER"}); //
        ) {

            stmt.setString(1, spitter.getUsername()); //
            stmt.setString(2, spitter.getPassword());
            stmt.setString(3, spitter.getFullName());
            stmt.execute(); //

            ResultSet generatedKeys = stmt.getGeneratedKeys();

            if (generatedKeys.next()) {

                long key = generatedKeys.getLong("IDUSER");
                spitter.setId(++key);
            }

            System.out.println(spitter);

        } catch (SQLException e) { //
            System.out.println("catch");
        } */
/*finally {
            try {
                if (stmt != null) { //
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                //
            }
        }*//*

    }

    */
/*public void saveSpitter(Spitter spitter){}//todo*//*

        private static final String SQL_UPDATE_SPITTER =
            "update spitter set username = ?, password = ?, fullname = ?"
                    + "where iduser = ?";
    public void saveSpitter(Spitter spitter) {
        spitter.setId(5L);
        //Connection conn = null;
        //PreparedStatement stmt = null;
        System.out.println(spitter.getId());
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE_SPITTER);
        ) {
             // Получить соединение
            //stmt = conn.prepareStatement(SQL_UPDATE_SPITTER); // Создать запрос
            stmt.setString(1, spitter.getUsername()); // Связать параметры
            stmt.setString(2, spitter.getPassword());
            stmt.setString(3, spitter.getFullName());
            stmt.setLong(4, spitter.getId());
            stmt.execute(); // Выполнить запрос
        } catch (SQLException e) { // Обработать исключение (как-нибудь)
            System.out.println("catch save");

            // Все еще не верен, что можно было бы предложить здесь
        } */
/*finally {
            try {
                if (stmt != null) { // Освободить ресурсы
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // и здесь
            }
        }*//*

    }

    private static final String SQL_SELECT_SPITTER =
            "select iduser, username, PASSWORD, fullname from spitter where iduser = ?";
    public Spitter getSpitterById(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection(); // Получить соединение
            stmt = conn.prepareStatement(SQL_SELECT_SPITTER); // Создать запрос
            stmt.setLong(1, id); // Связать параметры
            rs = stmt.executeQuery(); // Выполнить запрос
            Spitter spitter = null;
            if (rs.next()) { // Обработать результаты
                System.out.println("next");
                spitter = new Spitter();
                spitter.setId(rs.getLong("iduser"));
                spitter.setUsername(rs.getString("username"));
                spitter.setPassword(rs.getString("password"));
                spitter.setFullName(rs.getString("fullname"));
            }
            return spitter;
        } catch (SQLException e) { // Обработать исключение (как-нибудь)
            System.out.println("exception");
        } finally {
            if(rs != null) {
                try { // Освободить ресурсы
                    rs.close();
                } catch(SQLException e) {}
            }
            if(stmt != null) {
                try {
                    stmt.close();
                } catch(SQLException e) {}
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch(SQLException e) {}
            }
        }
        return null;
    }

}
*/
