package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

//this one when you want to use Inhertance type joined means there is table contains all client
//and also a table  of client who extends in this table and id of Client who in Table client = Id in other table
//@Inheritance(strategy = InheritanceType.JOINED)
//this one when you want to use one table what ever how much class extends in client
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Client_Type")
//@DiscriminatorValue("Client")

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	public Client(String name) {
		this.name = name;
	}
	public Client() {}
	
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
	
	
}
