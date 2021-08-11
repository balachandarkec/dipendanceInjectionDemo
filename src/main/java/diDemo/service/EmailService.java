package diDemo.service;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService{

	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message : "+msg);
		
	}

}
