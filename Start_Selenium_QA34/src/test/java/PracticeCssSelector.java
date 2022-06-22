import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;

public class PracticeCssSelector {
    WebDriver wd;

    @Test
    public void CssSelectors(){
        wd= new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //click to login button
        WebElement loginTab = wd.findElement(By.cssSelector("a[href=\"https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com\"]"));
        loginTab.click();
        //fill valid email
        WebElement emailtextbox = wd.findElement(By.cssSelector("#modalusername"));
        emailtextbox.click();
        emailtextbox.clear();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        emailtextbox.sendKeys("username"+ randomInt +"@gmail.com");
        emailtextbox.clear();

        wd.navigate().back();
        wd.navigate().forward();
        WebElement emailtextbox1 = wd.findElement(By.cssSelector("#modalusername"));
        emailtextbox1.click();
        emailtextbox1.clear();

        Random randomGenerator1 = new Random();
        int randomInt1 = randomGenerator1.nextInt(1000);
        emailtextbox1.sendKeys("username"+ randomInt +"@gmail.com");

        //fill psw
        WebElement psw=wd.findElement(By.cssSelector("[type=\"password\"]"));
        psw.click();
        psw.clear();
        psw.sendKeys("Jonatan1986$");

        //click to eye show
        WebElement eye=wd.findElement(By.cssSelector("[class=\"PasswordInput_show_pwd_btn__Ncc9S\"]"));
        eye.click();

        // click to sign up
        WebElement signUp=wd.findElement(By.xpath("//span[normalize-space()='Sign up']"));
        signUp.click();

//        //click to sign up fo free
        WebElement SignUpForFree=wd.findElement(By.cssSelector("[class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]"));
        SignUpForFree.click();
    }
}
//table[@id]//tr[5]/td[2]
//*[text() = 'Helen Bennett']
//div[@class='login_login__3EHKB']/..
//div[@class='login_login__3EHKB']/parent::*
//br/ancestor::html
//button[2]/preceding-sibling::input[2]