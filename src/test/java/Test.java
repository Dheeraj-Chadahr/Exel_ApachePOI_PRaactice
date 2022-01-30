import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/SAI/Downloads/ChromeDriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

//        Find Elelemnt using locator attribute "ID"
        driver.findElement(By.id("inputUsername")).sendKeys("dheeraj@test.com");

//        Find Elelemnt using locator attribute "NAME"
        driver.findElement(By.name("inputPassword")).sendKeys("Password");

//         Find Elelemnt using locator attribute "NAME"
        driver.findElement(By.className("signInBtn")).click();

//        find element using locator css selector tagname.attribute (for attribut class use dot)
//        it print the validation message if user enter the wrong password
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

//         Find Elelemnt using locator CSS attribute "className"
//        driver.findElement(By.cssSelector("button.signInBtn")).click();
//
////         Find Elelemnt using locator CSS attribute "ID" i.e tagname#attribute
//        driver.findElement(By.className("input#inputUsername")).click();
//
////         Find Elelemnt using locator CSS when there is no ID & Classname if there if attribute"PlaceHolder" i.e tagname[attribute='value']
//        driver.findElement(By.className("input[placeholder='Username']")).click();

//      Find Elemnt using locator Link text of forgot password button
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);

//        xpath-
//      //tagname[@attribute='value']
//      //input[@id='password']

//        Find element for name element using Xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("dheeraj@xunison.in");


//        CSS-
//      tagname[attribute='value']
//      input[id='password']
//      input[placeholder='Email']
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("xyz@mmm.com");

        // for clear data from the box element
        driver.findElement(By.id("")).clear();

        // for xpath> if  there is more then one element with same attribute and value we can use their index for calling them
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("xyz");

        // for css > calling element using index
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();

        // xpath > treval from parents to child elment
            // Use double slash at frist for parent then use single slash only for child element
        driver.findElement(By.xpath("//form/input[3]"));
        // here i  used index for multiple elements avaible in the page

        // CSS > for travel parent to child use parent ( tagname + empty space )
        // "form p" it is used for validation messaage for blank entry

        //CSS using rgular expression (*) star work as regular expression using this we can find element using partial text
        // For ex. there is a text value is password using regular expression we need to enter only pass instead of password

    }
}
