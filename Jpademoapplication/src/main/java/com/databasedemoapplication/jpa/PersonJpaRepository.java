package com.databasedemoapplication.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

//import com.databasedemoapplication.Jpademoapplication.entity.Aniruddha_person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	
	//connect the database
	@PersistenceContext
	EntityManager entityManager; 
	
	public AniruddhaPerson findById(int id) {
	   return entityManager.find(AniruddhaPerson.class,id);
	}
	
	public AniruddhaPerson update(AniruddhaPerson person) {
		   return entityManager.merge(person);
		
	}
	public AniruddhaPerson insert(AniruddhaPerson person) {
		   return entityManager.merge(person);
	   
	}
}
