import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://sharelane.com/");

        WebElement enterBtn = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));

        enterBtn.click();

        WebElement singUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));

        singUp.click();

        WebElement zipCodeField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));

        zipCodeField.sendKeys("55555");

        WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        btnContinue.click();

        WebElement firstName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));

        firstName.sendKeys("Kate");

        WebElement lastName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));

        lastName.sendKeys("Oriekhova");

        WebElement emailField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));

        emailField.sendKeys("myemail@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));

        passwordField.sendKeys("12345");

        WebElement confirmPasswordField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));

        confirmPasswordField.sendKeys("12345");

        WebElement btnRegister = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));

        btnRegister.click();

        WebElement elAcc = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Account is created!", elAcc.getText());

        driver.close();

         driver.quit();

    }
}
