package kodlamaio.hrms.core.utils.adapters.concretes;

import kodlamaio.hrms.core.utils.adapters.abstracts.IEmailVerification;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.User;

public class EmailVerificationManager implements IEmailVerification{

	@Override
	public Result verification(User user) {
		return new SuccessResult("E-Mail Doğrulandı");
	}

}
