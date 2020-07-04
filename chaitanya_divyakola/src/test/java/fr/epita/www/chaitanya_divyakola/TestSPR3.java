package fr.epita.www.chaitanya_divyakola;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;

public class TestSPR3 {
	
	
	@Inject
	@Named("mainDS")
	DataSource dataSource;
	
	
	@Test
	public void testDS() throws Exception {

		Assert.assertNotNull(dataSource);
		
		
	}

}
