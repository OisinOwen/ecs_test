import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PageActions extends BaseTest {
    PageObjects objects = new PageObjects();

    public void click(By elementLocator) {
        driver.findElement(elementLocator).click();
    }

    public void enterText(By elementLocator, String text){
        driver.findElement(elementLocator).sendKeys(text);
    }

    public void goToChallenge(){
        click(objects.renderTestButton);
        click(objects.renderTestButton);
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(objects.answer1));
//        action.build().perform();

    }

    public String getText(By elementLocator){
        String text = driver.findElement(elementLocator).getText();
        return text;
    }

    public void goToElement(By elementLocator){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(elementLocator));
        action.build().perform();
    }
}
