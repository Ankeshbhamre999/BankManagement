package my.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.app.entity.Clgdata;

public interface ClgRepository extends JpaRepository<Clgdata, Integer> {

}
