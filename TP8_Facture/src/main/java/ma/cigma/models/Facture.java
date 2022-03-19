package ma.cigma.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TFacture")
public class Facture {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FACTURE", length = 50)
	private long id;
	@Column(name = "DATE_FACTURE")
	private Date date_facture;
	@Column(name = "AMOUNT_FACTURE")
	private double amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate_facture() {
		return date_facture;
	}
	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Facture [id=" + id + ", date_facture=" + date_facture + ", amount=" + amount + "]";
	}
	public Facture() {
		
	}
	public Facture(Date date_facture, double amount) {

		this.date_facture = date_facture;
		this.amount = amount;
	}
	public Facture(long id, Date date_facture, double amount) {
		super();
		this.id = id;
		this.date_facture = date_facture;
		this.amount = amount;
	}
	
	
	
	

}
