package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.PositionService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesDataResult;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.PositonsDao;
import kodlamaio.hrms.entities.concretes.Positions;
import lombok.Data;
@Data
@Service
public class PositionManager implements PositionService{
	private PositonsDao positionDao;

	@Override
	public DataResult<List<Positions>> getAll() {
		return new SuccesDataResult<List<Positions>>(positionDao.findAll(),"Data listed succesfully");
	}
   @Autowired
	public PositionManager(PositonsDao positionDao) {
		super();
		this.positionDao = positionDao;
	}
@Override
public Result addPositon(Positions positions) {
	positionDao.save(positions);
	return new SuccesResult("Data added succesfully");
	
}

}
