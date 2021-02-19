package com.billies_works.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.billies_works.app.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
