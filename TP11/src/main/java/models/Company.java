package models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;

import lombok.Data;

@Entity
@Data
//@IdClass(CompanyId.class)
public class Company {
	/*// id table simple
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	*/
	
	// id table avec 2 clés primaire
	/*
	@Id
	private long rc;
	@Id
	private long idTribunal;
	*/
	// c'est équivalent de la 2éme méthode (2 clés primaire) + @IdClass(CompanyId.class)
	@EmbeddedId
	private CompanyId id;
	
	private String name;
	private String address;
	private String phone;
	private String contactFirstName;
	private String contactLastName;
	private String contactPhone;
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name ="PHONE_PERSON"))
	private ContactPerson contactPerson;

}
