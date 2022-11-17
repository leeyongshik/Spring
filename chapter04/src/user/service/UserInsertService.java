package user.service;

import java.util.Scanner;

import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserInsertService implements UserService {
	private UserDTO userDTO;
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	@Override
	public void execute() {
		System.out.println();
		Scanner s = new Scanner(System.in);
		//데이터
		System.out.print("이름 입력 : ");
		String name= s.next();
		System.out.print("아이디 입력 : ");
		String id= s.next();
		System.out.print("비밀번호 입력 : ");
		String pwd= s.next();
		
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		userDAO.write(userDTO);
		
		//응답
		System.out.println(name + "님의 데이터를 DB에 저장했습니다.");
		

	}

}
