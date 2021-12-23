package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IEmployerService;
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
	public List<Employer> getAll() {
		return employerDao.findAll();
	}

}
