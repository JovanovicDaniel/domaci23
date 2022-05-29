import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrviSelenijum {
    public static void main(String[] args) {

        //Otići na https://www.stealmylogin.com/demo.html, uneti bilo koje kredencijale za login, prisisnuti dugme.
        //Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje.
        // Ako jeste, štampati “Nice”.
        // Ako nije, štampati “Not nice.”
        //Sve elemente koji se koriste smestiti u intuitivno imenovane promenljive.
        //Kod na git, screen recording puštanja i izvršavanja testa na Drive.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.stealmylogin.com/demo.html");
        // driver.navigate().to("https://www.stealmylogin.com/demo.html");

        WebElement boxOne = driver.findElement(By.name("username"));
        boxOne.sendKeys("proba");

        WebElement boxTwo = driver.findElement(By.name("password"));
        boxTwo.sendKeys("proba");

        WebElement login = driver.findElement(By.xpath("/html/body/form/input[3]"));
        login.click();

        // driver.getCurrentUrl();

        if (driver.getCurrentUrl().equals("https://example.com/")){
            System.out.println("Nice");
        } else {
            System.out.println("Not nice");
        }
        // driver.close();
    }
}
