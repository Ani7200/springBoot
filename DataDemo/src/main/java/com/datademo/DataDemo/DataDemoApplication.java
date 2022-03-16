package com.datademo.DataDemo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataDemoApplication implements CommandLineRunner {
	
	
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJbdcDAO dao;
	

	public static void main(String[] args) {
		SpringApplication.run(DataDemoApplication.class, args);
		//System.out.println("Hello");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All useres -> {}", dao.findAll());
		System.out.println("All useres -> {}"+ dao.findAll());
		   //logger.info("User 1111 -> {}",dao.findbyid(1111));
		System.out.println("User 1111 -> {}"+dao.findbyid(1111));
		  // logger.info("deleting 1222 -> {} no.of rows deleted-{}",dao.deleteByid(1222));
		 System.out.println("deleting 9090 -> {} no.of rows deleted-{}"+dao.deleteByid(9090));  
		   // logger.info("Inserting 5151 ->{}",dao.insertByid(new AniruddhaPerson(5151,"kunal","Pune",new Date())));
		//System.out.println("Inserting 5151 ->{}"+ dao.insertByid(new AniruddhaPerson(5151,"Kunal","Pune",new Date())));
		  //  logger.info("updating 8888 ->{}",dao.UpdateByid(new AniruddhaPerson(8888,"Kunal","Mumbai",new Date())));
		    System.out.println("updating 1111->{}"+dao.UpdateByid(new AniruddhaPerson(1111,"Kunal","Mumbai",new Date())));
		}
		
}
