package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.EmplooyersSerive;
import kodlamaio.hrms.dataAccess.abstracts.EmplooyersDao;
import kodlamaio.hrms.entities.concretes.Emplooyers;
import lombok.Data;
@Service
@Data
public class EmplooyerManager implements EmplooyersSerive {
	private EmplooyersDao emplooyersDao;

	@Override
	public List<Emplooyers> getAll() {
		return this.emplooyersDao.findAll();
	}
    @Autowired
	public EmplooyerManager(EmplooyersDao emplooyersDao) {
		super();
		this.emplooyersDao = emplooyersDao;
	}

}
