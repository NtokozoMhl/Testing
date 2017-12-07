import org.openqa.selenium.ie.InternetExplorerDriver;

public class testBrowser {

	public static void main (String []args) {
		
		String startPage = "C:\\Users\\IBM_ADMIN\\eclipse-workspace\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",startPage);
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://q-secured.nedbank.co.za/#/auth/login");
	}
}
