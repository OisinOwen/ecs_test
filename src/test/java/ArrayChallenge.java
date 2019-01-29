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
    public void arraysChallenge() throws InterruptedException{
        actions.goToChallenge();
        String answer1 = String.valueOf(arrays.getCentre(arrays.getArray(0)));
        String answer2 = String.valueOf(arrays.getCentre(arrays.getArray(1)));
        String answer3 = String.valueOf(arrays.getCentre(arrays.getArray(2)));

        actions.enterText(objects.answer1, answer1);
        actions.enterText(objects.answer2, answer2);
        actions.enterText(objects.answer3, answer3);
        actions.enterText(objects.nameField, "Oisin Owen");
        actions.goToElement(objects.submit);
        actions.click(objects.submit);

        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(objects.confirmation).isDisplayed());
    }
}
