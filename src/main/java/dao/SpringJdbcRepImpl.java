/*
package dao;

import model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

*/
/**
 * Created by ���� on 04.07.2017.
 *//*


@Repository("springrep")
public class SpringJdbcRepImpl implements Rep {

    private static final String SQL_INSERT_SPITTER =
            "insert into spitter (username, password, fullname) values (?, ?, ?)";


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addSpitter(Spitter spitter) {
        jdbcTemplate.update(SQL_INSERT_SPITTER, // �������� ������
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName());
    }

    @Override
    public void saveSpitter(Spitter spitter) {

    }
    private static final String SQL_SELECT_SPITTER_BY_ID =
            "select iduser, username, PASSWORD, fullname from spitter where iduser = ?";

    @Override
    public Spitter getSpitterById(long id) {
        return jdbcTemplate.queryForObject( // ������ �� ��������� ������
                SQL_SELECT_SPITTER_BY_ID,
                new SingleColumnRowMapper<Spitter>() {
                    public Spitter mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Spitter spitter = new Spitter(); // �����������
                        spitter.setId(rs.getLong(1)); // �����������
                        spitter.setUsername(rs.getString(2)); // � ������
                        spitter.setPassword(rs.getString(3));
                        spitter.setFullName(rs.getString(4));
                        return spitter;
                    }
                },
                id // ���������� ����������
        );
    }
}
*/
