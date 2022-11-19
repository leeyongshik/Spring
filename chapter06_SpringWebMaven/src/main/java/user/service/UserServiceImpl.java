package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public void write(UserDTO userDTO) {
		//DB
		userDAO.write(userDTO);
		
		
	}

	@Override
	public boolean isExistId(String id) {
		boolean exist = userDAO.isExistId(id);
		return exist;
	}

	@Override
	public List<UserDTO> getList() {

		return userDAO.getList();
		
	}

	@Override
	public UserDTO getUser(String id) {
		//DB
		return userDAO.getUser(id);
	}

}
