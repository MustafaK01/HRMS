package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Employer;

public interface IEmployerService {
	ResultData<List<Employer>> getAll();
	Result add(Employer employer);
}
