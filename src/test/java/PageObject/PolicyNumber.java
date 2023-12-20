package PageObject;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class PolicyNumber {


    //Search by Policy Number.
    String IDPassportNumberXpath = "(//input[@id='idpassportno_search'])[1]";

    // Search Button
    String SearchButtonXpath = "//button[@class='rz-button rz-button-md rz-variant-filled rz-primary rz-shade-default ']";


    // Logic Implementations
    @Step("Enter Policy Number")
    public void EnterPolicyNumber(String IDPassportNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(IDPassportNumberXpath))).click();
    }
    @Step("Click Search Button")
    public void SearchButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SearchButtonXpath))).click();

    }

}
