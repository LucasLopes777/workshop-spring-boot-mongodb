package com.lukasledok.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lukasledok.workshopmongo.domain.User;
import com.lukasledok.workshopmongo.dto.UserDTO;
import com.lukasledok.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@Autowired
	private UserService service;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findall(){
		List<User> list = service.findall();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
}
