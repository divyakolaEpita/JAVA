package fr.epita.www.chaitanya_divyakola;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.www.datamodel.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestSPR3 {
	
	@Inject
	Person person;
	
	
	@Test
	public void testPersonInsertion() {
		person.setName("chaitanya_divyakola");
		person.setSex("M");
		person.setAge(24);
		person.setHeight(183);
		person.setWeight(66);
		
		System.out.println(
				"Feched person in :  "+ person.getName()+ " sex is :"+person.getSex()
				+" age is :" + person.getAge()+ " with height :" + person.getHeight()
				+" and weight is " + person.getWeight()
				);
	}
	
	

}
