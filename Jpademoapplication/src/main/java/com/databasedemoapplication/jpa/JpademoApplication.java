package com.databasedemoapplication.jpa;

import java.util.Date;

import javax.persistence.AssociationOverride;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

//import com.datademo.DataDemo.AniruddhaPerson;

//import com.datademo.DataDemo.AniruddhaPerson;

import org.slf4j.Logger;
@SpringBootApplication
public class JpademoApplication  implements CommandLineRunner {

	
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
		
		
	}
	
	
	
	@Override
	public void run(String...args) throws Exception{
		
		//logger.info("find by id id -> {}",repository.findById(1222));
		//System.out.println("find by id is ->{}"+repository.findById(1111));
		
		//System.out.println("updating 1333->{}"+repository.update(new AniruddhaPerson(1333,"atharva","pune",new Date())));
		
		//System.out.println("Inserting 140 ->{}"+ repository.insert(new AniruddhaPerson(140,"Aniruddha","Pune",new Date())));
		
		System.out.println("deleting 1111 -> {} no.of rows deleted-{}"+repository.findById(1111));  
		
		
	}
	
	

}
