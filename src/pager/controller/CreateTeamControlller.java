package pager.controller;

import pager.datatype.TeamDetails;
import pager.service.CreateTeamService;

@RequestMapping("/createTeam")
public class CreateTeamControlller {
	
	@Autowired
	CreateTeamService createTeamService;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public ResponseEntity<> createTeamInDB(@RequestPayload TeamDetails teamDetails){
		boolean isTeamCreated = createTeamService.createTeam(teamDetails);
		
		String msg = isTeamCreated ? "Created Team" : "Failed to create team";
		
		return isTeamCreated ? new ResponseEntity<>(msg, HttpStatus.OK) : new ResponseEntity<>(msg, HttpStatus.ERROR) ;
	}

}
