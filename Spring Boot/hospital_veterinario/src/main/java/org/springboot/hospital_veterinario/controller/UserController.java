package org.springboot.hospital_veterinario.controller;

import java.util.List;

import org.springboot.hospital_veterinario.model.UserJsonModel;
import org.springboot.hospital_veterinario.model.UserModel;
import org.springboot.hospital_veterinario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<UserModel> getUser() {
        return userRepository.findAll();
    }
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public UserModel GetById(@PathVariable(value = "id") long id) {
		return userRepository.findById(id);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public UserModel userCreate(@RequestBody UserModel user) {
		UserModel userModel = new UserModel();
		userModel.setName(user.getName());
		userModel.setEmail(user.getEmail());
		userModel.setPassword(user.getPassword());
		return userRepository.save(userModel);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public UserModel userUpdate(@PathVariable(value = "id") long id, @RequestBody UserJsonModel user) {
		UserModel userModel = userRepository.findById(id);
		userModel.setName(user.getName());
		userModel.setEmail(user.getEmail());
		userModel.setPassword(user.getPassword());
		return userRepository.save(userModel);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public UserModel userDelete(@PathVariable(value = "id") long id) {
		return userRepository.deleteById(id);
	}
}
