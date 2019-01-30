import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayChallenge extends BaseTest{
    PageObjects objects = new PageObjects();
    PageActions actions = new PageActions();
    Arrays arrays = new Arrays();


    @BeforeClass
    public void start(){
        setUp();
    }

    @Test
    public void arraysChallenge(){
        //Find the challenge on the page
        actions.goToChallenge();

        //Do challenge and return answers
        String answer1 = String.valueOf(arrays.getCentre(arrays.getArray(0)));
        String answer2 = String.valueOf(arrays.getCentre(arrays.getArray(1)));
        String answer3 = String.valueOf(arrays.getCentre(arrays.getArray(2)));

        //Populate form with answers and submit
        actions.enterText(objects.answer1, answer1);
        actions.enterText(objects.answer2, answer2);
        actions.enterText(objects.answer3, answer3);
        actions.enterText(objects.nameField, "Oisin Owen");
        actions.goToElement(objects.submit);
        actions.click(objects.submit);

        //Wait until failure message changes to success
        Wait wait = new WebDriverWait(driver, 10);
        Boolean success = wait.until(ExpectedConditions.textToBePresentInElementLocated(objects.confirmation, "Congratulations")).equals(true);

        //Assert success message is displayed
        Assert.assertTrue(success);
    }
}
