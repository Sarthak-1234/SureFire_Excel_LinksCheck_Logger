package Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class HomePage {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
	
	@Test
	public void homePageTestCase() {
		LOGGER.info("HomePage TestCase -----written using logger2");
		LOGGER.info("edited by mohit");
	}
	
	//Project > Classes TestNG.xml > TestNG given to Maven > Run Maven
	
	//Git
	//Jenkins >>>it will pick POM.xml not testng.xml

}
