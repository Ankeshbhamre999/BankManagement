package my.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Empolyee 
{
	@Id
	@Column(name="empid")
	private Integer empId;
	
	@Column(name="empcity")
	private String empName;
	
	@Column(name="empc")
	private String empCity;

	public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empolyee(Integer empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}
	
	
	

}
