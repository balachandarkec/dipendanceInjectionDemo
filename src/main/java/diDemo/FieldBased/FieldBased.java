package diDemo.FieldBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import diDemo.service.MessageService;

@Component
public class FieldBased {
	
	@Autowired
	@Qualifier("SMSService")
	private MessageService msgs;
	
	public void processMsg(String msg) {
		msgs.sendMsg(msg);
	}

}
