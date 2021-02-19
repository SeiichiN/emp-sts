package com.billies_works.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "empList")
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_empno_gen")
	@SequenceGenerator(name = "seq_empno_gen", sequenceName = "seq_empno", allocationSize = 1)
	private Integer empno;
	
	@Column
	private String ename;
	
	@Column
	private String job;
	
	@Column
	private Integer sal;
	
	@Column
	private Integer age;
	
	@Column
	private Integer deptno;
}
