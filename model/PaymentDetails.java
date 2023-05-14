package com.velocity.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "payment")
public class PaymentDetails {

	// id,name,city
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int Billid;
	private Date PaidDate;
	private Double Amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBillid() {
		return Billid;
	}
	public void setBillid(int billid) {
		Billid = billid;
	}
	public Date getPaidDate() {
		return PaidDate;
	}
	public void setPaidDate(Date paidDate) {
		PaidDate = paidDate;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	

	
}
