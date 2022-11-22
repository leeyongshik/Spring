package user.service;

import java.util.List;

import user.bean.UserDTO;

public interface UserService {

	public void write(UserDTO userDTO);

	public boolean isExistId(String id);

	public List<UserDTO> getList();

	public UserDTO getUser(String id);

	public void update(UserDTO userDTO);

}
