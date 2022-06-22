import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {

    WebDriver wd = new ChromeDriver();

    @Test
    public void fromCssToxPath(){
        wd.findElement(By.cssSelector("a[href]"));    //a[@href]
        wd.findElement(By.cssSelector("[href ^='/ho']"));   //*[starts-with(@href,"/ho")]
        wd.findElement(By.cssSelector("div.focus")); //div[contains(@class='focus')]
        wd.findElement(By.cssSelector("input[type='text']")); //input[@type='text']
        wd.findElement(By.cssSelector("div #host")); //div//*[@id='host']
        wd.findElement(By.cssSelector("table#contry tr:nt-child(3)) td:last-child")); //table[@id='country']//tr[3]//td()]
        wd.findElement(By.cssSelector("div#idName li:first-child")); //div[@id='idName']//li[1]
        wd.findElement(By.cssSelector("div#sort>div:nth-child(2)")); //div[@id='sort'/div[2]

    }


    @Test
    public void fromXPathToCss(){
        wd.findElement(By.xpath("//*[@id='host'));   ("#host")
        wd.findElement(By.xpath("//button[@class='submit']")); ("button.submit")
        wd.findElement(By.xpath("//div/div/img[@src='paris.jpg']")); ("div.div.img[src='paris.jpg']")
        wd.findElement(By.xpath("//div[@class='first' and @class='list']")); ("div.first and .list")
        wd.findElement(By.xpath("//div[contains(@class,'st']"));  ("div[class='st']")
        wd.findElement(By.xpath("//div[@id=’idName’]//h1[last()]")); ("div#idName" h1:last-child"))
        wd.findElement(By.xpath("//table[@id]//tr[last()]")); ("table# tr:last-child")
        wd.findElement(By.xpath("//a[starts-with(@id,'ret')]")); ("a.starts-with#ret")

    }
}