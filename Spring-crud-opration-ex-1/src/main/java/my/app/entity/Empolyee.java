package my.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class Empolyee 
{
	@Id
	@Column(name="eid")
	private Integer empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="sal")
	private String  empSal;
	
	@Column(name="add")
	private String empAdd;
	public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empolyee(Integer empId, String empName, String empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
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
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	
	

}
