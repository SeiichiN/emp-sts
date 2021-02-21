package com.billies_works.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Emp {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_empno_gen")
	@SequenceGenerator(name = "seq_empno_gen", sequenceName = "seq_empno", allocationSize = 1)
	@Id
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
	
	public Emp() {}
	
	public Emp( int empno, String ename, String job, int sal, int age, int deptno ) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.age = age;
		this.deptno = deptno;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
}
