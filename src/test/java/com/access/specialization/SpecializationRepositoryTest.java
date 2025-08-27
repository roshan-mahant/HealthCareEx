package com.access.specialization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.access.entity.Specialization;
import com.access.repo.SpecializationRepository;

@DataJpaTest(showSql=true)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class SpecializationRepositoryTest {

	@Autowired
	private SpecializationRepository repo;
	
	/*
	 * 1. Test save operation
	 */
	@Test
	@Order(1)
	public void testSpecCreate() {
		
		Specialization spec = new Specialization(null, "CRDLS", "Cardiologists", "They are experts on the heart and blood vessels.");
		Specialization specOutput = repo.save(spec);
		assertNotNull(spec.getId(), "Spec is not created!");
	}
	/*
	 * 2. Test display all operation
	 */
	@Test
	@Order(2)
	public void testSpecFetchAll() {
		List<Specialization> list = repo.findAll();
		assertNotNull(list);
		//assertThat(list.size()>0);
		if(list.isEmpty()) {
			fail("No data exists in Database.");
		}
	}
}
