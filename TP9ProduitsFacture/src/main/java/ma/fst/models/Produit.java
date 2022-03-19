package ma.fst.models;

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
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Produit;
	@Column
	private String name;
	@Column
	private String designation;
	@Column
	private double prix;
	@Column
	private int qte_dispo;
	/*
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,CascadeType.MERGE
    })
    @JoinTable( name = "ligne_facture",
                joinColumns = @JoinColumn( name = "id_Produit" ),
                inverseJoinColumns = @JoinColumn( name = "num_facture" ) )
    */
    @ManyToMany(mappedBy = "produits", cascade = CascadeType.PERSIST)
	private List<Facture> factures;
	
	public Produit(String name, String designation, double prix, int qte_dispo) {
		super();
		this.name = name;
		this.designation = designation;
		this.prix = prix;
		this.qte_dispo = qte_dispo;
	}
	
	
	
	

}
