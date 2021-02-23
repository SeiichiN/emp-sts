package com.billies_works.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.billies_works.app.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

	List<Emp> findBySal (Integer sal); 
	
	List<Emp> findByJobAndAge (String job, Integer age);
	
	List<Emp> findByEnameLike (String ename);
}
