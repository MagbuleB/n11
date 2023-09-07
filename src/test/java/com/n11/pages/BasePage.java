package com.n11.pages;

import com.n11.utilites.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.getDriver(), this);}
}
