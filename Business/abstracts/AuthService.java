package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.dtos.EmplooyeDto;
import kodlamaio.hrms.entities.concretes.dtos.EmplooyerDto;

public interface AuthService {
	Result Registerasemplooye(EmplooyeDto emplooyeDto);
	Result Registerasemplooyer(EmplooyerDto emplooyerDto);

}
