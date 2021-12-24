package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utils.results.Result;
import kodlamaio.hrms.core.utils.results.ResultData;
import kodlamaio.hrms.entities.concretes.User;

public interface IUserService {
	ResultData<List<User>> getAll();//bir get fonksiyonu olduğu için ve data getirip 'sonuç' göndereceği için ResultData tipinde tanımlandı. 
	Result add(User user);//Result döndürecek aynı zamanda veri set edecek. Veri set ettiği, get etmediği için Result tipinde tanımlandı.
}
