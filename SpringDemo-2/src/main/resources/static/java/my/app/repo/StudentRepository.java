package my.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
