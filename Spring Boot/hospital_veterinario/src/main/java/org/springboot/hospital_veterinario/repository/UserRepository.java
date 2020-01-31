package org.springboot.hospital_veterinario.repository;

import org.springboot.hospital_veterinario.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long>{
	
	UserModel findById(long id);
	
	UserModel deleteById(long id);
}
