package com.takeoff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.rest.conversations.v1.conversation.Message;
import com.takeoff.model.JollyLoginDTO;
import com.takeoff.model.JollyLoginStatusDTO;
import com.takeoff.model.JollySignupDTO;
import com.takeoff.service.JollyServiceClass;
import com.twilio.Twilio;
import com.twilio.rest.conversations.v1.Conversation;
import com.twilio.rest.conversations.v1.conversation.Participant;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "JOLLY")
public class JollyController {
	
	@Autowired
	JollyServiceClass service;
	
	 public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
	
	@RequestMapping(value = "whatsapp")
	public String whatsapp() {

	  Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	  Conversation conversation = Conversation.creator().create();
	  
	  Participant participant = Participant.creator(conversation.getSid())
              .setMessagingBindingAddress("whatsapp:+919449840144")
              .setMessagingBindingProxyAddress("whatsapp:+918121908464")
              .create();
     
      return "";
	}
	
//	MessagingServiceSid=MGd081f54e2ed7d41ac1a26383a72d202a
//			&EventType=onMessageAdded
//			&Attributes=%7B%7D
//			&DateCreated=2024-12-18T14:35:28.423Z
//			&Index=8
//			&ChatServiceSid=IS4c4a462a93e042e591cf1372486010c8
//			&MessageSid=IMd098f0d004a74546b90272c069ba42b6
//			&AccountSid=AC00d36fe88cedc1d3681bce8b2ee878a2
//			&Source=WHATSAPP
//			&RetryCount=0
//			&Author=whatsapp:%2B919449840144
//			&ParticipantSid=MB41fbceca44744a8ba10cbbce01722116
//			&Body=Dhdhdn
//			&ConversationSid=CH6f3dda8fba2846e28462649aa8b8d207
	
	@RequestMapping(value = "whatsapprespond")
	public String whatsapprespond(String MessagingServiceSid, String EventType, String Attributes, String DateCreated, String Index, String ChatServiceSid,
			String MessageSid, String AccountSid, String Source, String RetryCount,String Author, String ParticipantSid, String Body, String ConversationSid ) {

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	  Message message = Message.updater(ConversationSid, MessageSid)
              .setAuthor("regretfulUser")
              .setBody("I take back what I said")
              .update();
	  
	  
     
      return "";
	}

	@RequestMapping(value = "login")
	public JollyLoginStatusDTO login(@RequestBody JollyLoginDTO login) {

		return service.login(login);

	}
	
	@RequestMapping(value = "sendOTP")
	public Boolean sendOTP(String mobile) throws Exception {

		return service.sendOTP(mobile);

	}
	
	@RequestMapping(value = "verifyOTP")
	public JollyLoginStatusDTO verifyOTP(String mail, String mobile, String password) throws Exception {

		return service.verifyOTP(mail, password, mobile);

	}
	
	@RequestMapping(value = "signup")
	public JollyLoginStatusDTO signup(@RequestBody JollySignupDTO signup) throws Exception {
		return service.signup(signup);
	}
	
	@RequestMapping(value = "/getLoginDetails")
	public JollyLoginStatusDTO getLoginDetails() throws Exception {
		return service.getLoginDetails();
		
	}


}
