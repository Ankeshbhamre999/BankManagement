package my.app.implservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.app.entity.Empolyee;
import my.app.repo.EmpRepository;
import my.app.service.EmpService;
@Service
public class EmpImplService implements EmpService
{
	@Autowired
	private EmpRepository repo;

	@Override
	public Integer saveEmpolyee(Empolyee e) 
	{
		e=repo.save(e);
			  
		// TODO Auto-generated method stub
		return e.getEmpId();
	}

	@Override
	public void updateEmpolyee(Empolyee e)
	{
		
		repo.save(e);
		// TODO Auto-generated method stub

	}

	@Override
	public void DeleteEmpolyee(Integer id)
	{
		repo.deleteById(id);
		// TODO Auto-generated method stub

	}

	@Override
	public Empolyee GetoneEmpolyee(Integer id) {
		// TODO Auto-generated method stub
		Optional <Empolyee> opt=repo.findById(id);
		return opt.get();
	}

	@Override
	public List<Empolyee> getAllEmpoyee() {
		// TODO Auto-generated method stub
		return null;
	}

}
