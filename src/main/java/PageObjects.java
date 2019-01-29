import org.openqa.selenium.By;

public class PageObjects {

    By renderTestButton = By.cssSelector("button[data-test-id^='render-challenge']");
    By arrayTableBody = By.tagName("tbody");
    By answer1 = By.cssSelector("input[data-test-id^='submit-1']");
    By answer2 = By.cssSelector("input[data-test-id^='submit-2']");
    By answer3 = By.cssSelector("input[data-test-id^='submit-3']");
    By nameField = By.cssSelector("input[data-test-id^='submit-4']");
    By confirmation = By.className("dialog");
    By submit = By.xpath("//div[2]/button/div/div/span");
//    By submit = By.tagName("button");
}