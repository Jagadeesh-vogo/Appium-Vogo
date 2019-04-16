package page_objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageObjects {


    public LoginPageObjects(AndroidDriver<AndroidElement> driver ){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//android.widget.Button[@text='ALLOW']")
    public WebElement dialogAllow;

    @FindBy(xpath="//android.widget.TextView[@text='Sign in']")
    public WebElement signInText;

    @FindBy(xpath="//android.widget.EditText[@resource-id='com.VoDrive:id/text_input']")
    public WebElement enterMobileNumberEditText;

    @FindBy(xpath="//android.widget.TextView[@text='Enter your 10 digit mobile number']")
    public WebElement enterMobileNumberText;

    @FindBy(xpath="//android.widget.Button[@text='Get OTP']")
    public WebElement getOtpButton;

    public void allowPermission() {
        this.dialogAllow.click();
    }

    public void setMobileNumber(String number){
        this.allowPermission();
        this.enterMobileNumberEditText.sendKeys(number);
        //driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.VoDrive:id/text_input']")).sendKeys(number);
    }
    public void clickOnButton() {
        this.getOtpButton.click();
    }

    public void loginToVogo(String number) {
        this.setMobileNumber(number);
        this.clickOnButton();
    }

}
