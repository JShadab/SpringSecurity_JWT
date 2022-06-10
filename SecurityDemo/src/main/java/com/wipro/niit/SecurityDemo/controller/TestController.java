package com.wipro.niit.SecurityDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.niit.SecurityDemo.model.MyRequest;
import com.wipro.niit.SecurityDemo.model.MyResponse;
import com.wipro.niit.SecurityDemo.utils.JwtTokenUtil;

@RestController
public class TestController {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	UserDetailsService userDetailsService;

	@PostMapping("/authenticate")
	public ResponseEntity<MyResponse> authenticate(@RequestBody MyRequest request) {

		UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());

		String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new MyResponse(jwt));
	}

	@GetMapping("/welcome")
	public String welcome() {

		return "<H1>Welcome to SpringBoot Securiy Module</H1>";
	}

}
