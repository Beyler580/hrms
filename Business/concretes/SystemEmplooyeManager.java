package kodlamaio.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.SystemEmplooyeService;
import kodlamaio.hrms.dataAccess.abstracts.SystemEmplooyesDao;
import kodlamaio.hrms.entities.concretes.SystemEmplooyes;
import lombok.Data;
@Data
@Service
public class SystemEmplooyeManager implements SystemEmplooyeService {
	private SystemEmplooyesDao systemEmplooyesDao;

	@Override
	public List<SystemEmplooyes> getAll() {
		return this.systemEmplooyesDao.findAll();
	}
    @Autowired
	public SystemEmplooyeManager(SystemEmplooyesDao systemEmplooyesDao) {
		super();
		this.systemEmplooyesDao = systemEmplooyesDao;
	}

}
