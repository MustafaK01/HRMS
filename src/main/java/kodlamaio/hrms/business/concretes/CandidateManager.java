package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ICandidateService;
import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.core.utils.results.ResultDataSuccess;
import kodlamaio.hrms.core.utils.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ICandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidateManager implements ICandidateService{

	private ICandidateDao candidateDao;
	@Autowired
	public CandidateManager(ICandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}
	
	@Override
	public ResultData<List<Candidates>> getAll() {
		return new ResultDataSuccess<List<Candidates>>(candidateDao.findAll(),"İş Arayanlar Listelendi");
	}
	public Result add(Candidates candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("İş Arayan Eklendi");
		
	}

}
