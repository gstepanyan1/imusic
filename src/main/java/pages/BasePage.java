package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
    @FindBy(xpath = "/html/body/section[2]/div/section/nav/a[1]")
    private WebElement mainButton;
    public  WebElement returnBut(){
        return mainButton; // инкапсулировано
    }

}
