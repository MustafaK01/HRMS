package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Candidates;

public interface ICandidateService {
	ResultData<List<Candidates>> getAll();
	Result add(Candidates candidate);

}
