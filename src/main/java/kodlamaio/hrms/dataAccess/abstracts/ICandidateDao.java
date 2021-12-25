package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface ICandidateDao extends JpaRepository<Candidates,Integer> {
	boolean existsByNationalIdentity(String nationalIdentity);
	boolean existsByEmail(String email);
}
