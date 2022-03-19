package ma.fst.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_client;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String telephone;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_adresse", referencedColumnName = "id")
	private Adresse adresse;

}
