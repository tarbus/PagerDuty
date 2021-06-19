package pager.service;

import java.util.List;

import pager.datatype.Developer;
import pager.datatype.Team;
import pager.datatype.TeamDetails;

@Service
public class CreateTeamService {
	
	public boolean createTeam(TeamDetails teamdetails) {
		
		Team team = teamdetails.getName();
		String teamName = team.getName();
		
		List<Developer> developers = teamdetails.getDevelopers();
		
		try {
		//Insert into Teams table statement
		/*
		 * boolean isInserted = insert into TEAM values ()
		 */
		
		//Insert into Developers table
		/*
		 * for(Developer developer : developers){
		 * 	List<Query> developersInsert = 
		 * }
		 *  
		 */} catch(Exception ex) {
			 //Logger.error("Adding to table failed + " ex.getMessage());
			 return false;
		 }
		
		return true;
	}

}
