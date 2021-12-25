package kodlamaio.hrms.core.utils.checkers.abstracts;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface ICandidateRegistrationCheckService {
	boolean checkIfNotBlank(Candidates candidate);

}
