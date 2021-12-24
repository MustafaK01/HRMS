package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Jobs;

public interface IJobService {
	ResultData<List<Jobs>> getAll();
	Result add(Jobs job);
}
