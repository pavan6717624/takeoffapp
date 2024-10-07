package com.takeoff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeoff.model.JollyLoginDTO;
import com.takeoff.model.JollyLoginStatusDTO;
import com.takeoff.model.JollySignupDTO;
import com.takeoff.service.JollyServiceClass;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "JOLLY")
public class JollyController {
	
	@Autowired
	JollyServiceClass service;

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
