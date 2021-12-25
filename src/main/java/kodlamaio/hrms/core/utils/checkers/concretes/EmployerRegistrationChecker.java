package kodlamaio.hrms.core.utils.checkers.concretes;

import org.springframework.stereotype.Repository;

import kodlamaio.hrms.core.utils.checkers.abstracts.IEmployerRegistrationCheckService;
import kodlamaio.hrms.entities.concretes.Employer;

@Repository
public class EmployerRegistrationChecker implements IEmployerRegistrationCheckService{

	@Override
	public boolean checkIfNotBlank(Employer employer) {
		if(!employer.getEmail().isEmpty()&&
		   !employer.getPhoneNumber().isEmpty()&&
		   !employer.getCompanyName().isEmpty()&&
		   !employer.getWebAddress().isEmpty()&&
		   !employer.getPassword().isEmpty()){
			return true;
		}
		return false;
	}

	@Override
	public boolean checkEmailAddress(Employer employer) {
		String employerEmailDomain = employer.getEmail().substring(employer.getEmail().indexOf('@')+1);
		String employerWebAddressDomain = employer.getWebAddress().substring(employer.getWebAddress().indexOf('.')+1);
		if(employerEmailDomain.equals(employerWebAddressDomain)) {
			return true;
		}
		else return false;
	}
	

}
