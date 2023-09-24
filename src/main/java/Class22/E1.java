package Class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class E1 {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver w=new ChromeDriver();
       // WebDriver w=new SafariDriver();
       WebDriver [] browser = {new SafariDriver(), new ChromeDriver()};
       for (WebDriver arr:browser){
           arr.manage().window().maximize();
           Thread.sleep(2000);
           arr.navigate().to("https://amazon.com");
           Thread.sleep(2000);
           System.out.println(arr.getTitle());
           Thread.sleep(2000);
           arr.close();
       }

    }
}
