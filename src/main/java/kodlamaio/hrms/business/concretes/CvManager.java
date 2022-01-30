package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ICvService;
import kodlamaio.hrms.core.utils.results.*;
import kodlamaio.hrms.dataAccess.abstracts.ICvDao;
import kodlamaio.hrms.entities.concretes.Cv;

@Service
public class CvManager implements ICvService{
	
	ICvDao cvDao;
	@Autowired
	private CvManager(ICvDao cvDao) {
		this.cvDao=cvDao;
	}
	@Override
	public ResultData<List<Cv>> getAll() {
		return new ResultDataSuccess<List<Cv>>(this.cvDao.findAll(),"Veriler Getirildi");
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv Eklendi");
	}
	
	@Override
	public ResultData<List<Cv>> sortDescByGraduationYear() {
		return new ResultDataSuccess<List<Cv>>(this.cvDao.findAll(Sort.by(Sort.Direction.DESC, "school.endDateToEducation")),"Veriler Getirildi");
	}
	public ResultData<List<Cv>> sortAscByGraduationYear() {
		return new ResultDataSuccess<List<Cv>>(this.cvDao.findAll(Sort.by(Sort.Direction.ASC, "school.endDateToEducation")),"Veriler Getirildi");
	}

	
	
	
}
