package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Commande")
public class Commande {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id_cmd;
	@Column
	private Date dateCmd;
	@Column
	private double Prix_Total;
	
	public Commande() {}

	public Commande(Date dateCmd, double prix_Total) {
		super();
		this.dateCmd = dateCmd;
		Prix_Total = prix_Total;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}

	public double getPrix_Total() {
		return Prix_Total;
	}

	public void setPrix_Total(double prix_Total) {
		Prix_Total = prix_Total;
	}

	public long getId_cmd() {
		return id_cmd;
	}

	@Override
	public String toString() {
		return "Commande [id_cmd=" + id_cmd + ", dateCmd=" + dateCmd + ", Prix_Total=" + Prix_Total + "]";
	}

	

}
