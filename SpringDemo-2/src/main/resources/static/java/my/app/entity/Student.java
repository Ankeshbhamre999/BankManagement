package my.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student
{
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="rollno")
	private String rollno;
	
	@Column(name="add")
	private String add;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String rollno, String add) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String add) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", address=" + address + "]";
	}
	
	
	

}
