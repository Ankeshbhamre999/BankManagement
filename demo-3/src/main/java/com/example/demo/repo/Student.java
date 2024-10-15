package com.example.demo.repo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student
{
	@Id
	@Column(name="sid")
	private Integer  stuId;
	
	@Column(name="sname")
	private String stuName;
	
	@Column(name="sroll")
	private String rollno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuId, String stuName, String rollno) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.rollno = rollno;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", rollno=" + rollno + "]";
	}
	
	

}
