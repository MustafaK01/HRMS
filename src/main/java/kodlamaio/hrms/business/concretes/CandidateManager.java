package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ICandidateService;
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
	public List<Candidates> getAll() {
		return candidateDao.findAll();
	}

}
