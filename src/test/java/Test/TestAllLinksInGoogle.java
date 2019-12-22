package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.CheckResponse;

public class TestAllLinksInGoogle {
	
	@Test
	public void checkAllLinks() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver_windows.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("Number of Links: "+allLinks.size());
		for(WebElement e : allLinks) {
			//System.out.println(e.getAttribute("href"));
//			int response = checkResponse(e.getAttribute("href"));
//			System.out.println(e.getAttribute("href")+"-------->>>>>>> "+response);
			//Assert.assertEquals(response, 200);
			
			int ResponseCode = CheckResponse.getStatus(e.getAttribute("href"));
			Assert.assertEquals(ResponseCode, 200);
		}
	}
	
	

}
