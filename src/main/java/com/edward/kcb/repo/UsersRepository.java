package com.edward.kcb.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edward.kcb.models.AppUser;


@Repository
public interface UsersRepository extends JpaRepository<AppUser, Long> {
	
	Optional<AppUser> findByUsername(String username);

}
