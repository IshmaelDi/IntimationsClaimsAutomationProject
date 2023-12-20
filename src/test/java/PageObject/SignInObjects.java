package PageObject;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class SignInObjects  {


    // Claims Intimations URL
    String Url = "https://horizontest.clientele.co.za/horizon.ui/";


    // Sign In Credentials
    String UserName = "(//input[@id='i0116'])[1]";
    String NextButtonXpath = "(//input[@id='idSIButton9'])[1]";
    String Password1 = "(//input[@id='i0118'])[1]";
    String SignIn = "(//input[@id='idSIButton9']";


    // Logic Implementations

    @Step("Open Claims Iintimations Website")

    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }
    // Valid Login Credentials

    @Step("Login in using valid Credentials")

    public void PopUpLogin(String Username) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);
    }


    @Step("User click Next Button")
    public void NextButton() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NextButtonXpath))).click();
    }

    @Step("Enter Password")
    public void EnterPassword(String Password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Password1))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Password1))).sendKeys(Password);
    }
    @Step("Click SignIn Button")
    public void SignInButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignIn))).click();
    }



    }




