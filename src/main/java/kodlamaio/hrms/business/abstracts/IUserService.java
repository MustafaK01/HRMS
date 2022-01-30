package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.User;

public interface IUserService {
	ResultData<List<User>> getAll();
	Result add(User user);
}
