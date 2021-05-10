package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.PositionService;
import kodlamaio.hrms.dataAccess.abstracts.PositonsDao;
import kodlamaio.hrms.entities.concretes.Positions;
import lombok.Data;
@Data
@Service
public class PositionManager implements PositionService{
	private PositonsDao positionDao;

	@Override
	public List<Positions> getAll() {
		return this.positionDao.findAll();
	}
   @Autowired
	public PositionManager(PositonsDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

}
