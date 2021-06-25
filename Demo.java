import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenim jars and drivers\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.professionalqa.com/code-based-testing#:~:text=Code%20based%20testing%20is%20a,that%20coverage%20criteria%20is%20fullfilled.");

	}

}
