package my.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
 
import my.app.entity.Empolyee;

public interface EmpRepository extends JpaRepository<Empolyee, Integer> {

}
