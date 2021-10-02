package otherAPIs.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class FindBrokenLinks {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.amazon.com");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> tagsList = driver.findElements(By.tagName("a"));
        System.out.println(tagsList.size());

        List<String> urlList = new ArrayList<>();
        for(WebElement ele : tagsList){
            String url = ele.getAttribute("href");
           urlList.add(url);
            //checkBrokenLink(url);
        }
        urlList.parallelStream().forEach(e -> checkBrokenLink(e));

        driver.quit();

    }

    public static void checkBrokenLink(String url){

        try{
            URL url1 = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) url1.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.connect();
            if (urlConnection.getResponseCode() >= 400){
                System.out.println(url + "  is broken "+urlConnection.getResponseMessage());
            }else{
                System.out.println(url + "  "+urlConnection.getResponseMessage());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
