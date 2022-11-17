package user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import user.bean.UserDTO;

public interface UserDAO {
	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList();

	public UserDTO getUserOne(String id);

	public void update(Map<String, String> map);

	public int delete(String id);
}
