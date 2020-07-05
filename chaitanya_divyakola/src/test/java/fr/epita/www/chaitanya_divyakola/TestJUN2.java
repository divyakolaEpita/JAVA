package fr.epita.www.chaitanya_divyakola;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.epita.www.datamodel.Person;
import fr.epita.www.service.PersonController;

public class TestJUN2 {
	
	@BeforeClass
	public static void testBeforeclass() {
		System.out.println("BeforeClass Executed");
	}
	
	@Before
	public void testBefore() {
		System.out.println("Before each method executed");
	}
	
	@Test
	public void testPerson() throws IOException {
		PersonController personController = new PersonController();
		personController.personData();
	}
	
	@After
	public void testAfter() {
		System.out.println("After each method");
	}

	@AfterClass
	public static void testAfterClass() {
		System.out.println("All methords Executed");
	}
}
