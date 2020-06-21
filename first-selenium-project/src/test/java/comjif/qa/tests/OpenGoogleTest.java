package comjif.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


  public class OpenGoogleTest {
        WebDriver wd;


        @BeforeMethod
        public void setup() {
            wd = new ChromeDriver();


        }

        @Test
        public void testOpenGoogle() {
            wd.get("https://www.google.com/");
        }

        @AfterMethod
        public void tearDown() {

        }
    }




