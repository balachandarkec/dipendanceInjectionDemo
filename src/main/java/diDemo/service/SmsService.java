package diDemo.service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SmsService implements MessageService {

	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message : "+msg);
	}

}
