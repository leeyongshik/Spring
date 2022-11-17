package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import user.dao.UserDAO;

@Component
public class UserDeleteService implements UserService {
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void execute() {
		System.out.println();
		Scanner s = new Scanner(System.in);
		
		System.out.print("삭제 할 아이디 입력 : ");
		String id= s.next();
		
		int su = userDAO.delete(id);
		
		if(su==1) {
		System.out.println("삭제되었습니다.");
		} else System.out.println("삭제할 아이디가 없습니다.");
		
		

	}

}
