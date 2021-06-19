package pager.datatype;

import java.util.List;

public class TeamDetails {
	
	Team name;
	List<Developer> developers;
	public Team getName() {
		return name;
	}
	public void setName(Team name) {
		this.name = name;
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
	
	
}
