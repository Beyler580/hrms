package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.EmplooyeService;
import kodlamaio.hrms.dataAccess.abstracts.EmplooyeDao;
import kodlamaio.hrms.entities.concretes.Emplooyes;
import lombok.Data;
@Data
@Service
public class EmplooyeManager implements EmplooyeService {
	 private EmplooyeDao emplooyeDao;
    @Autowired
	public EmplooyeManager(EmplooyeDao emplooyeDao) {
		super();
		this.emplooyeDao = emplooyeDao;
	}

	@Override
	public List<Emplooyes> getAll() {
		return this.emplooyeDao.findAll();
	}

}
