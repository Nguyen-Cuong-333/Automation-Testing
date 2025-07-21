package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.*;
import pages.PracticeFormPage;

import static org.junit.jupiter.api.Assertions.*;

public class PracticeFormTest extends BaseTest {

    static PracticeFormPage formPage;
    static WebDriverWait wait;

    @BeforeAll
    static void init() {
        formPage = new PracticeFormPage(driver);
        wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    @Test
    @DisplayName("Điền form và submit thành công")
    void testSubmitForm() {
        formPage.open();
        formPage.fillForm("Nguyen", "Cuong", "cuong@example.com", "0987654321");

        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(formPage.getModalTitleLocator())).isDisplayed());
    }
}
