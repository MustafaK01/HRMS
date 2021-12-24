package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.IJobService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.ResultDataSuccess;
import kodlamaio.hrms.core.utils.results.SuccessResult;
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
	public ResultData<List<Jobs>> getAll() {
		return new ResultDataSuccess<List<Jobs>>(this.jobDao.findAll(),"İş Pozisyonları Listelendi");
	}

	@Override
	public Result add(Jobs job) {
		this.jobDao.save(job);
		return new SuccessResult("Başarıyla Eklendi");
	}

}

