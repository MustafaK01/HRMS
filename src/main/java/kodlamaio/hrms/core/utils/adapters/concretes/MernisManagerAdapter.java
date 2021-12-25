package kodlamaio.hrms.core.utils.adapters.concretes;
import java.rmi.RemoteException;

import org.springframework.stereotype.Repository;

import kodlamaio.hrms.core.utils.adapters.abstracts.IMernisServiceAdapter;
import kodlamaio.hrms.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Repository
public class MernisManagerAdapter implements IMernisServiceAdapter {

	@Override
	public boolean checkIfRealPerson(Candidates candidate) {
		KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
		boolean flag = false;
		try {
			flag = mernis.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalIdentity()), candidate.getFirstName(),
					candidate.getLastName(), candidate.getBirthOfYear());
		} catch (RemoteException e) {
				e.printStackTrace();
		}
		return flag;
	}
	
}
