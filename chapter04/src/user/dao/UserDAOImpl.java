package user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import lombok.Setter;
import user.bean.UserDTO;

/*
@Setter
public class UserDAOImpl implements UserDAO {
	private JdbcTemplate jdbcTemplate;

	@Override
	public void write(UserDTO userDTO) {
		String sql = "insert into usertable values(?,?,?)";
		
		jdbcTemplate.update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd()); //... -> 매개변수 자유롭게 
		//jdbcTemplate.update() => insert, update, delete 기능 
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}

}
*/


public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {

	@Override
	public void write(UserDTO userDTO) {
		String sql = "insert into usertable values(?,?,?)";
		
		getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd()); //... -> 매개변수 자유롭게 
		//jdbcTemplate.update() => insert, update, delete 기능 
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}

	@Override
	public UserDTO getUserOne(String id) {
		String sql = "select * from usertable where id=?";

		try {
			return getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<UserDTO>(UserDTO.class),id);
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void update(Map<String, String> map) {
		String sql = "update usertable set name=? , pwd=? where id=?";
		getJdbcTemplate().update(sql, map.get("name"),map.get("pwd"),map.get("id"));
		
		
	}

	@Override
	public int delete(String id) {
		
		String sql = "DELETE FROM usertable WHERE id=?";
		int su = getJdbcTemplate().update(sql,id);
		System.out.println(su);
		
		return su;
		
	}

}
