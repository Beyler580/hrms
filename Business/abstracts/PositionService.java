package kodlamaio.hrms.Business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Positions;

public interface PositionService {
	List<Positions> getAll();

}
