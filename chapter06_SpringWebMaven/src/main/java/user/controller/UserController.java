package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;

@Component
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/writeFrom")
	public String writeFrom() {
		return "user/writeFrom";
	}
	
	@PostMapping(value = "write")
	@ResponseBody //리턴값이 없을때 xml로 가지 않고 돌아가도록 설정
	public void write(@ModelAttribute UserDTO userDTO) {
		//DB
		userService.write(userDTO);
	}
	
	@PostMapping(value = "/checkId")
	@ResponseBody
	public String checkId(@RequestParam String id) {
		System.out.println(id);
		boolean exise = userService.isExistId(id);
		String result = (exise+"");
		System.out.println(exise);
		return result;
	}

}
