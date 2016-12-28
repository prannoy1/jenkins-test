package delete;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class del {
	@Test
	public void test() {
		System.out.println("start");		
		WebDriver d= new FirefoxDriver();
		d.get("http://www.google.com");
		System.out.println(d.getTitle());
                System.out.println("stop");

}
}
