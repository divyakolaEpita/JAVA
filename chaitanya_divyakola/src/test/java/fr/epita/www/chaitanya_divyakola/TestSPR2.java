package fr.epita.www.chaitanya_divyakola;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestSPR2 {

	
	
	@Inject
	@Named("myFirstBean")
	String firstBean;
	
	
	@Test
	public void testFirstIntegration() {
		Assert.assertNotNull(firstBean);
		System.out.println(firstBean);
	}
}
