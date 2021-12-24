package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IEmployerService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.ResultDataSuccess;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.IEmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements IEmployerService{

	private IEmployerDao employerDao;
	@Autowired
	public EmployerManager(IEmployerDao employerDao) {
		this.employerDao=employerDao;
	}
	@Override
	public ResultData<List<Employer>> getAll() {
		return new ResultDataSuccess<List<Employer>>(employerDao.findAll(),"İşverenler Listelendi");
	}
	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren Eklendi");
	}
	
}
