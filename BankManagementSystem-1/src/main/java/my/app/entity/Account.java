package my.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Account")
public class Account
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long accoun_No;
	@Column
	private String acoount_holderName;
	@Column
	private Double account_balaance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Long accoun_No, String acoount_holderName, Double account_balaance) {
		super();
		this.accoun_No = accoun_No;
		this.acoount_holderName = acoount_holderName;
		this.account_balaance = account_balaance;
	}
	public Long getAccoun_No() {
		return accoun_No;
	}
	public void setAccoun_No(Long accoun_No) {
		this.accoun_No = accoun_No;
	}
	public String getAcoount_holderName() {
		return acoount_holderName;
	}
	public void setAcoount_holderName(String acoount_holderName) {
		this.acoount_holderName = acoount_holderName;
	}
	public Double getAccount_balaance() {
		return account_balaance;
	}
	public void setAccount_balaance(Double account_balaance) {
		this.account_balaance = account_balaance;
	}
	@Override
	public String toString() {
		return "Account [accoun_No=" + accoun_No + ", acoount_holderName=" + acoount_holderName + ", account_balaance="
				+ account_balaance + "]";
	}
	
	

}
