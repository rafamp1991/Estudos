package org.springboot.hospital_veterinario.controller;

import java.util.List;

import org.springboot.hospital_veterinario.model.UserModel;
import org.springboot.hospital_veterinario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users", method =  RequestMethod.GET)
    public List<UserModel> getUser()
    {
        return userRepository.findAll();
    }
}
