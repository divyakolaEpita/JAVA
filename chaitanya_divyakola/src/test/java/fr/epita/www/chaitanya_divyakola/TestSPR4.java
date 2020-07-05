package fr.epita.www.chaitanya_divyakola;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestSPR4 {
	
	
	@Inject
	@Named("mainDS")
	DataSource dataSource;
	
	
	@Test
	public void testDS() throws Exception {

		Assert.assertNotNull(dataSource);
		
		
	}

}
