package kodlamaio.hrms.core.utils.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface IMernisServiceAdapter {
	boolean checkIfRealPerson(Candidates candidate);
}
