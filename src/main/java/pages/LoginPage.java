package pages;

import org.openqa.selenium.By;

public class LoginPage {

    By TXTUSERNAME = By.xpath("//input[@name='userName']");
    By TXTPASSWORD = By.xpath("//input[@name='password']");
    By BTNSUBMIT = By.xpath("//input[@name='submit']");

    public By getTXTUSERNAME() {
        return TXTUSERNAME;
    }

    public By getTXTPASSWORD() {
        return TXTPASSWORD;
    }

    public By getBTNSUBMIT() {
        return BTNSUBMIT;
    }
}
