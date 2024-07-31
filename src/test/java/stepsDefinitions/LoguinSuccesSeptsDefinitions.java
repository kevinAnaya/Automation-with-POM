package stepsDefinitions;

import driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import steps.LoginStep;

public class LoguinSuccesSeptsDefinitions {

    @After
    public void tearDown(){
        GoogleChromeDriver.quitBrowser();
    }

    LoginStep ls = new LoginStep();
    HomePage hp = new HomePage();

    @ParameterType(".*")
    public String email(String email){
        return email;
    }

    @ParameterType(".*")
    public String password(String password){
        return password;
    }

    @ParameterType(".*")
    public String message(String message){
        return message;
    }

    @Given("the user enter the page")
    public void theUserEnterThePage() {
        ls.openBrowser("https://demo.guru99.com/test/newtours/index.php");
    }

    @When("the user enter the {email} as email")
    public void theUserEnterTheEmailAsEmail(String email) {
        ls.enterName(email);
    }

    @When("the user enter the {password} as password")
    public void theUserEnterThePasswordAsPassword(String password) {
        ls.enterPassword(password);
        ls.clickSubmit();
    }

    @Then("the user looks at the {message} as message")
    public void theUserLooksAtTheMessageAsMessage(String message) {
        String textObtenied = GoogleChromeDriver.driver.findElement(hp.getMESSAGE()).getText();
        Assert.assertEquals(textObtenied, message);
    }
}
