package com.lukasledok.workshopmongo.services;	

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukasledok.workshopmongo.domain.User;
import com.lukasledok.workshopmongo.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findall(){
		return repo.findAll();
	}
}
