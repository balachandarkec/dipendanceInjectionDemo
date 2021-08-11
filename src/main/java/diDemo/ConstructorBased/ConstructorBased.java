package diDemo.ConstructorBased;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import diDemo.service.MessageService;

@Component
public class ConstructorBased {
	private MessageService msgservice;
	
	@Autowired
	public ConstructorBased(@Qualifier("TwitterService") MessageService msgservice) {
		this.msgservice=msgservice;
	}
	
	public void processMsg(String msg) {
		msgservice.sendMsg(msg);
	}
}
	
	