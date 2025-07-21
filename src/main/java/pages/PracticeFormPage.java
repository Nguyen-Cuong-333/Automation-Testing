package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By genderMale = By.xpath("//label[text()='Male']");
    private By mobile = By.id("userNumber");
    private By submit = By.id("submit");
    private By modalTitle = By.id("example-modal-sizes-title-lg");

    public void open() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void fillForm(String fName, String lName, String emailAddr, String phone) {
        type(firstName, fName);
        type(lastName, lName);
        type(email, emailAddr);
        click(genderMale);
        type(mobile, phone);
        scrollTo(submit);
        click(submit);
    }

    public By getModalTitleLocator() {
        return modalTitle;
    }
}
