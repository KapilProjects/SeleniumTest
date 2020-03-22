import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main (String[] arg)
    {
        String driverPath = "C:\\JavaProjects\\SeleniumTest\\Lib\\geckodriver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);
        WebDriver obj = new FirefoxDriver();
        obj.get("http://www.facebook.com");

        obj.findElement(By.id("email")).sendKeys("jamki@rediff.com");
        obj.findElement(By.id("pass")).sendKeys("hahahah");
        obj.findElement(By.id("u_0_b")).click();
    }
}
