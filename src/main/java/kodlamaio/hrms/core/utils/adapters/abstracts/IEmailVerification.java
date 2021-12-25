package kodlamaio.hrms.core.utils.adapters.abstracts;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface IEmailVerification {
	Result verification(User user);
}
