package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface ICandidateService {
	List<Candidates> getAll();

}