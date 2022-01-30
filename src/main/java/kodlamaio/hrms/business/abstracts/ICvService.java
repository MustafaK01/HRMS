package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.Cv;

public interface ICvService {
	ResultData<List<Cv>> getAll();
	Result add(Cv cv);
	ResultData<List<Cv>> sortDescByGraduationYear();
	ResultData<List<Cv>> sortAscByGraduationYear();

}
