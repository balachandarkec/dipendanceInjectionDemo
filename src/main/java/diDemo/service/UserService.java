package diDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {
	
	private MessageService msgService;
	
	
	
	
	@Autowired
	@Qualifier("TwitterService")
	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}



	public void processMessage(String message) {
		// TODO Auto-generated method stub
		msgService.sendMsg(message);
	}

}
