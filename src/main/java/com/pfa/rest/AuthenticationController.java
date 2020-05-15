package com.pfa.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.dto.LoginRequest;
import com.pfa.dto.LoginResponse;
import com.pfa.entity.User;
import com.pfa.security.JwtTokenUtil;
import com.pfa.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/authentification")
public class AuthenticationController {
	Logger log = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserService userService;

	@PostMapping(value = "/login")
	public ResponseEntity<LoginResponse> register(@RequestBody LoginRequest loginUser) throws AuthenticationException {
		log.info("LoginRequest:{}",loginUser);

		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
		final User user = userService.findByUsername(loginUser.getUsername());
		if (user != null) {
			final String token = jwtTokenUtil.generateToken(user);
			return new ResponseEntity<LoginResponse>(new LoginResponse(token, user.getUsername()), HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<LoginResponse>(new LoginResponse(null, null), HttpStatus.UNAUTHORIZED);
	}

}
