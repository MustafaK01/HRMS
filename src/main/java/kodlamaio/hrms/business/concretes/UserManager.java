package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IUserService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.ResultDataSuccess;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.IUserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements IUserService{
	
	private IUserDao userDao;
	
	@Autowired
	public UserManager(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public ResultData<List<User>> getAll() {
		return new ResultDataSuccess<List<User>>(this.userDao.findAll(),"Kullanıcılar Listelendi");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Başarıyla Eklendi");
	}
}
