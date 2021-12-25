package kodlamaio.hrms.core.utils.checkers.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utils.checkers.abstracts.ICandidateRegistrationCheckService;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidateRegistrationChecker implements ICandidateRegistrationCheckService{

	@Override
	public boolean checkIfNotBlank(Candidates candidate) {
		if(!candidate.getEmail().isEmpty()&&
		   !candidate.getFirstName().isEmpty()&&
		   !candidate.getLastName().isEmpty()&&
		   !candidate.getNationalIdentity().isEmpty()&&
		   !candidate.getPassword().isEmpty()&&
		   !(candidate.getBirthOfYear()>2005||candidate.getBirthOfYear()<1970)) {
			return true;
		}
		return false;
	}
}
