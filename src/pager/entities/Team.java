package pager.entities;

@Entity("TEAM")
public class Team {
	
	@Id
	@Column("name")
	Long id;
	
	@Constraint("unique")
	@Column("name")
	String name;
	
	
	
}
