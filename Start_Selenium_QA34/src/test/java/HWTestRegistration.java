import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class HWTestRegistration {
    WebDriver wd;
    @Test
    public void firstRegistrationSuccess(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        //open form --> click login button
        WebElement loginTab= wd.findElement(By.cssSelector("[href*='/login']"));
        loginTab.click();
        //fill valid email
        WebElement emailTextBx = wd.findElement(By.cssSelector("[placeholder=\"Email\"]"));
        emailTextBx.click();
        emailTextBx.clear();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        emailTextBx.sendKeys("username"+ randomInt +"@gmail.com");
        //fill valid password
        WebElement passwordTextBox =wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Jj12345$");
        //click to button registration


        //1 way
//      WebElement regbutton = wd.findElement(By.xpath("(//button[normalize-space()='Registration'])[1]"));
//     regbutton.click();

//2 way
        WebElement regbutton =wd.findElement(By.cssSelector("[class=\"login_login__3EHKB\"]>:last-child"));
        regbutton.click();
    }


}
