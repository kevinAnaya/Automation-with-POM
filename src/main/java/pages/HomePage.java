package pages;

import org.openqa.selenium.By;

public class HomePage {

    By MESSAGE = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b");

    public By getMESSAGE() {
        return MESSAGE;
    }
}
