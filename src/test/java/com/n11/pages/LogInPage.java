package com.n11.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    @FindBy(css = "a[class='btnSignIn']")
    public WebElement girisYap;

    @FindBy(css="div[data-connecturl=\"https://www.n11.com/social/facebookRouter?source=WEB_REGULAR_FB&scope=email,user_birthday\"]")
    public WebElement facebookIleGirisYap;

    @FindBy(css = "input[id='email']")
    public WebElement emailOrPhoneInputBox;

    @FindBy(css = "input[id='pass']")
    public WebElement passwordInputBox;

    @FindBy(css = "input[name='login']")
    public WebElement LogInBtn;


    @FindBy(css = "div[class='orderAndTicketTopMenu']>ul>li>a")
    public WebElement siparislerimTitle;

    @FindBy(css = "div[id='myLocation-close-info']")
    public WebElement adresEkleTamam;


    @FindBy(id="480698fc-e6ac-41bc-a722-51059b783200")
    public WebElement cookiesTumunuKabulEt;





}
