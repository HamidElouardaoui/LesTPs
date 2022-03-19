package ma.cigma.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TClient")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLT", length = 50)
	private long id;
	@Column(name = "NAME_CLT", length = 50)
	private String name;
	
	public Client() {}
	
	public Client(String name) {
		super();
		this.name = name;
	}

	public Client(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + "]";
	} 

}
