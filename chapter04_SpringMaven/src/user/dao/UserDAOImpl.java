package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
//public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {

	@Autowired
	public void setDS(DataSource dataSource){
		setDataSource(dataSource);
	}

	@Override
	public void write(UserDTO userDTO) {
		//String sql = "insert into usertable values(?,?,?)";
		//getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd()); //... -> 매개변수 자유롭게 
		//jdbcTemplate.update() => insert, update, delete 기능
		String sql = "insert into usertable values(:name,:id,:pwd)";
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}

	@Override
	public UserDTO getUserOne(String id) {
		String sql = "select * from usertable where id=:id";

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
