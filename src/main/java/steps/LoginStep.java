package steps;

import driver.GoogleChromeDriver;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep {

    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();

    @Step
    public void openBrowser(String url) {
        GoogleChromeDriver.ChromeDriver(url);
    }

    @Step
    public void enterName(String email){
        GoogleChromeDriver.driver.findElement(lp.getTXTUSERNAME()).sendKeys(email);
    }

    @Step
    public void enterPassword(String password){
        GoogleChromeDriver.driver.findElement(lp.getTXTPASSWORD()).sendKeys(password);
    }

    @Step
    public void clickSubmit(){
        GoogleChromeDriver.driver.findElement(lp.getBTNSUBMIT()).click();
    }






}
