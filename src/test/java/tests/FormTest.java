package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class FormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void FillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Name");
        $("#lastName").setValue("LastName");
        $("#userEmail").setValue("test@mail.ru");
        //$("#gender-radio-1.custom-control-input").click();
        $("#userNumber").setValue("0123456789");
        //$("#dateOfBirth").setValue("01 01 2000");
        //$("#subjectsContainer").setValue("informatics");

    }
}
