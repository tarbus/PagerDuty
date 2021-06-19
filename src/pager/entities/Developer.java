package pager.entities;

@Entity("DEVELOPER")
public class Developer {

	@Id
	@Column("id")
	Long id;
	
	@Join_ManyToOne("id")
	Team team_id;
	
	@Column("name")
	String name;
	
	@Column("phone_number")
	String phone_number;
}
