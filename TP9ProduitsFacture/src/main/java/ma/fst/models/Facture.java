package ma.fst.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num_facture;
	@Column
	private Date date_facture;
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,CascadeType.MERGE
    })
    @JoinTable( name = "ligne_facture",
                joinColumns = @JoinColumn( name = "num_facture" ),
                inverseJoinColumns = @JoinColumn( name = "id_Produit" ) )
	private List<Produit> produits;

	public Facture(Date date_facture) {
		super();
		this.date_facture = date_facture;
	}
	
	

}
