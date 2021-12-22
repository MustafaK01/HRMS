package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.User;

public interface IUserService {
	List<User> getAll();
}
