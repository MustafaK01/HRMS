package kodlamaio.hrms.core.utils.checkers.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface IEmployerRegistrationCheckService {
	boolean checkIfNotBlank(Employer employer);
	boolean checkEmailAddress(Employer employer);
}
