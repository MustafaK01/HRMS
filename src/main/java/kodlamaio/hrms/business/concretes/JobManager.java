package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IJobService;
import kodlamaio.hrms.dataAccess.abstracts.IJobDao;
import kodlamaio.hrms.entities.concretes.Jobs;

@Service
public class JobManager implements IJobService{

	private IJobDao jobDao;
	
	@Autowired
	public JobManager(IJobDao jobDao) {
		this.jobDao = jobDao;
	}

	@Override
	public List<Jobs> getAll() {
		return this.jobDao.findAll();
	}
}
