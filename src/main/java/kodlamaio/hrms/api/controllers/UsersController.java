package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.IUserService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private IUserService userService;
	
	@Autowired
	public UsersController(IUserService userService) {
		this.userService = userService;
	}
	@GetMapping("/getall")
	ResultData<List<User>> getAll(){
		return userService.getAll();
	}
	@PostMapping("/add")
	Result add(@RequestBody User user) {
		this.userService.add(user);
		return new SuccessResult("Başarıyla eklendi");
	}
	
}
