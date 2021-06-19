package pager.controller;

import pager.datatype.TeamDetails;
import pager.service.CreateTeamService;
import pager.service.NotificationService;

@RequestMapping("/sendAlert/{teamId}")
public class SendAlertController {
	
	@Autowired
	NotificationService notificationService;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public ResponseEntity<> createTeamInDB(@PathParam("teamId") Long teamId, @RequestPayload("msg") String message){
		String isAlertSentMessage = notificationService.sendAlert(teamId, message);
		
		String msg = isAlertSent ? "Alert Sent" : "Alert not sent to developers";
		
		return isTeamCreated ? new ResponseEntity<>(msg, HttpStatus.OK) : new ResponseEntity<>(msg, HttpStatus.ERROR) ;
	}
}