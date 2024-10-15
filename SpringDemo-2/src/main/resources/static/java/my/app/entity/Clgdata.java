package my.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Clgdata
{
	@Id
	@Column(name="id")
	private Integer  clid;
	@Column(name="name")
	private String clName;
	@Column(name="add")	
	private String Cladd;
	public Clgdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clgdata(Integer clid, String clName, String cladd) {
		super();
		this.clid = clid;
		this.clName = clName;
		Cladd = cladd;
	}
	public Integer getClid() {
		return clid;
	}
	public void setClid(Integer clid) {
		this.clid = clid;
	}
	public String getClName() {
		return clName;
	}
	public void setClName(String clName) {
		this.clName = clName;
	}
	public String getCladd() {
		return Cladd;
	}
	public void setCladd(String cladd) {
		Cladd = cladd;
	}
	@Override
	public String toString() {
		return "Clgdata [clid=" + clid + ", clName=" + clName + ", Cladd=" + Cladd + "]";
	}
	
	

}
