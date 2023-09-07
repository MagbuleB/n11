package com.n11.step_definitions;

import com.n11.pages.LogInPage;
import com.n11.utilites.ConfigurationReader;
import com.n11.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.security.KeyFactorySpi;

public class LogIn_Step_Definition {

   LogInPage logInPage=new LogInPage();

    @Given("user should navigate to n11 link")
    public void user_should_navigate_to_n11_link() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//        logInPage.cookiesTumunuKabulEt.click();
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }



    @When("user logs in with Facebook")
    public void user_logs_in_with_facebook() {
        logInPage.facebookIleGirisYap.click();

    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String emailOrPhone, String password) {
        logInPage.emailOrPhoneInputBox.sendKeys(emailOrPhone);
        logInPage.passwordInputBox.sendKeys(password);

    }
    @When("user clicks Log In button")
    public void user_clicks_log_in_button() {
        logInPage.LogInBtn.click();

    }


        @Then("verify user is in {string} title")
        public void verify_user_is_in_title(String expectedTitle) {
            String actualTitle= Driver.getDriver().getTitle();
            String expectedTitle1=expectedTitle;
            Assert.assertEquals(expectedTitle1,actualTitle);
        }



}
