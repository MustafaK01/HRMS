package kodlamaio.hrms.core.utils.checkers.concretes;


import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utils.checkers.abstracts.IEmployerRegistrationCheckService;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
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
		boolean employerEmailIsContainsAt = employer.getEmail().contains("@");
		boolean employerWebAddressIsContainsCom = employer.getWebAddress().contains(".com");
		boolean employerWebAddressIsContainswww =employer.getWebAddress().contains("www.");
		if(employerEmailDomain.equals(employerWebAddressDomain)&&
				employerEmailIsContainsAt&&
				employerWebAddressIsContainsCom&&
				employerWebAddressIsContainswww) {
			return true;
		}
		else return false;
	}
	

}
