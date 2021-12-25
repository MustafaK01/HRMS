package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IEmployerService;
import kodlamaio.hrms.core.utils.checkers.abstracts.IEmployerRegistrationCheckService;
import kodlamaio.hrms.core.utils.results.ErrorResult;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.ResultDataSuccess;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.IEmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements IEmployerService{

	private IEmployerDao employerDao;
	private IEmployerRegistrationCheckService employerRegistrationChecker;
	@Autowired
	public EmployerManager(IEmployerDao employerDao,
			IEmployerRegistrationCheckService employerRegistrationChecker) {
		this.employerDao=employerDao;
		this.employerRegistrationChecker=employerRegistrationChecker;
	}
	@Override
	public ResultData<List<Employer>> getAll() {
		return new ResultDataSuccess<List<Employer>>(employerDao.findAll(),"İşverenler Listelendi");
	}
	@Override
	public Result add(Employer employer) {
		if(employerRegistrationChecker.checkIfNotBlank(employer)) {
			if(employerRegistrationChecker.checkEmailAddress(employer)) {
				if(this.employerDao.existsByEmail(employer.getEmail())) {
					return new ErrorResult("İşveren Zaten Var");
				}
				this.employerDao.save(employer);
				return new SuccessResult("İşveren Eklendi");
			}
			else return new ErrorResult("Şirket E-Mailinizi Girin");
		}
		return new ErrorResult("Alanları Doldurun");
	}
	
}
