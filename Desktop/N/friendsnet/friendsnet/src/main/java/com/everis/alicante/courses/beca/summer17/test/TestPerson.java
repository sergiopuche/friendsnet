package com.everis.alicante.courses.beca.summer17.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.entity.Person

public class TestPerson {

	private Person expectedPerson = new Person();
	private final Long personId = Long.valueOf(1);

	@Before
	public void inicializacion() {

		expectedPerson.setId(personId);

	}

	@Test

	public void testGetIdPerson() {
		// Arrange

		// Act

		Long id = expectedPerson.getId();

		// Assert

		Assert.assertEquals(personId, id);

	}

	// Arrange

	// Act

	// Assert

}
