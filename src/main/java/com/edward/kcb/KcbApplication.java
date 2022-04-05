package com.edward.kcb;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.edward.kcb.models.Account;
import com.edward.kcb.models.AppUser;
import com.edward.kcb.models.Card;
import com.edward.kcb.services.AccountsService;
import com.edward.kcb.services.CardsService;
import com.edward.kcb.services.UsersService;

@SpringBootApplication
public class KcbApplication {
	
	@Autowired 
	private  PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(KcbApplication.class, args);
	}
	
	@Bean 
	CommandLineRunner run(UsersService userService, AccountsService accService, CardsService cardService) {
		return args ->{
			userService.createSystemUsers(new AppUser(1l,"kcb1@gmail.com",passwordEncoder.encode("kcb1"), Collections.singletonList(new SimpleGrantedAuthority("USER"))));
			userService.createSystemUsers(new AppUser(2l,"kcb2@gmail.com",passwordEncoder.encode("kcb2"),Collections.singletonList(new SimpleGrantedAuthority("USER"))));
			
			accService.addNewAccount(new Account(1l,1234L,"KIMEQTY","kcb1@gmail.com"));
			accService.addNewAccount(new Account(2l,4321L,"KIMKCB","kcb2@gmail.com"));
			
			cardService.addNewCard(new Card(1l,"credit card",1l,"Virtual"));
			cardService.addNewCard(new Card(2l,"Debit card",2l,"physical"));
		}; 
	}

}
