package kodlamaio.hrms.Business.concretes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.Business.abstracts.AuthService;
import kodlamaio.hrms.Business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.EmplooyeDao;
import kodlamaio.hrms.dataAccess.abstracts.EmplooyersDao;
import kodlamaio.hrms.entities.concretes.Emplooyes;
import kodlamaio.hrms.entities.concretes.dtos.EmplooyeDto;
import kodlamaio.hrms.entities.concretes.dtos.EmplooyerDto;
import lombok.Data;


@Service
@Data
public class AuthManager implements AuthService {
	private UserService userService;
	private EmplooyersDao emplooyerDao;
	private EmplooyeDao emplooyeDao;

	@Autowired
	public AuthManager(UserService userService, EmplooyersDao emplooyerDao,
			EmplooyeDao emplooyeDao) {
		super();
		this.userService =  userService ;
		this.emplooyerDao = emplooyerDao;
		this.emplooyeDao = emplooyeDao;
	}
	

	@Override
	public Result Registerasemplooye(EmplooyeDto emplooye) {
		if (checkEmployeeDTO(emplooye) == null) {
			return new ErrorResult("Eklenirken bir hata olustu");
		}
		//User usertoRegister= new User(emplooye.getId(),emplooye.getEmail(),emplooye.getPassword());
		//userService.add(usertoRegister);
		Emplooyes emplooyeToRegister = new Emplooyes(emplooye.getId(),emplooye.getFirstName(),emplooye.getLastName(),emplooye.getDateOfBirth(),emplooye.getNationalityId());
        emplooyeDao.save(emplooyeToRegister);
        return new SuccesResult("Kullanici basariyla eklendi");
	}

	@Override
	public Result Registerasemplooyer(EmplooyerDto emplooyerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public Result checkEmployeeDTO(EmplooyeDto emplooyeDto) {
		if(isEmplooyeAllFieldsFilled(emplooyeDto).isSucces()) {
			return isEmplooyeAllFieldsFilled(emplooyeDto);
		}
		 if(checkEmplooyeEmail(emplooyeDto).isSucces()) {
			return checkEmplooyeEmail(emplooyeDto);
		}
	//	if(checkEmplooye(emplooyeDto).isSucces()) {
			//return checkEmplooye(emplooyeDto);
		//}
		if(checkEmplooyePassword(emplooyeDto).isSucces()) {
			return checkEmplooyePassword(emplooyeDto);
		}
		return null ;
		

	}
	public Result isEmplooyeAllFieldsFilled(EmplooyeDto emplooyeDto) {
		if((emplooyeDto.getPassword().equals(""))
				|| (emplooyeDto.getVerifyPassword().length() <=0) ||
				(emplooyeDto.getFirstName().length() <=0)||
				(emplooyeDto.getLastName().length() <=0)||
		       (emplooyeDto.getEmail().length() <=0) ||
		       (emplooyeDto.getDateOfBirth().toString().length() <=0)){
			   return new ErrorResult("Tum alanlari doldurmak zorunludur.");
		}
		return new SuccesResult("Tum alanlar dolduruldu");
		
		
	}
	public Result checkEmplooyeEmail(EmplooyeDto emplooyeDto) {
		if(userService.getEmail(emplooyeDto.getEmail()) != null) {
			return new ErrorResult("Bu eposta zaten kullanimda.");
		}
		return new SuccesResult("Eposta kullanimidan gecti");
	}
	public Result checkEmplooyePassword(EmplooyeDto emplooyeDto) {
		if(emplooyeDto.getPassword().equals(emplooyeDto.getVerifyPassword())) {
			return new SuccesResult("Sifreler uyusuyor");
		}
		return new ErrorResult("Sifreler uyusmuyor.");
	}
//	public Result checkEmplooye(EmplooyeDto emplooyeDto) {
	//	if(emplooyeDao.findBynationality_id(emplooyeDto.getNationalityId())!=null){
	//		return new ErrorResult("Boyle bir kullanici mevcut");
			
	//	}
	//	return new SuccesResult();
		
		
	//}


	

}
