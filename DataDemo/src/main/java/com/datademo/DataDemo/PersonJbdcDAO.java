package com.datademo.DataDemo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJbdcDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<AniruddhaPerson> findAll() {

		return jdbcTemplate.query("select * from aniruddha_person ",
				new BeanPropertyRowMapper<AniruddhaPerson>(AniruddhaPerson.class));
	}

	public AniruddhaPerson findbyid(int id) {
		return jdbcTemplate.queryForObject("select * from aniruddha_person  where id=?", new Object[] { id },
				new BeanPropertyRowMapper<AniruddhaPerson>(AniruddhaPerson.class));

	}

	public int deleteByid(int id) {
		return jdbcTemplate.update("delete from aniruddha_person  where id=?", new Object[] { id });
	}

	public int insertByid(AniruddhaPerson person) {

		return jdbcTemplate.update(
				"INSERT INTO `aniruddha_person`(`id`, `name`, `location`, `birth_date`) VALUES (?,?,?,?)",

				new Object[] { person.getId(), person.getName(), person.getLocation(), person.getBirthDate() });
	}

	public int UpdateByid(AniruddhaPerson person) {
		return jdbcTemplate.update("update aniruddha_person set name=?,location=?,birth_date=?" + "where id=?",

				new Object[] { person.getName(), person.getLocation(), person.getBirthDate(), person.getId() });
	}
}
