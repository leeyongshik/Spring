package user.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserUpdateService implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public void execute() {
		System.out.println();
		Scanner s = new Scanner(System.in);
		
		System.out.print("수정 할 아이디 입력 : ");
		String id= s.next();
		
		//DB
		UserDTO userDTO = userDAO.getUserOne(id);
		
			if(userDTO == null) {
				System.out.println("찾고자하는 아이디가 없습니다.");
				return;
			}
			System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t" + userDTO.getPwd());
			
			
			System.out.print("수정 할 이름 입력 : ");
			String name = s.next();
			System.out.print("수정 할 비밀번호 입력 : ");
			String pwd = s.next();
			
			Map<String ,String> map = new HashMap<String, String>();
			map.put("name",name);
			map.put("id",id);
			map.put("pwd",pwd);
		
			userDAO.update(map);
			
			System.out.println("업데이트 완료");

	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
