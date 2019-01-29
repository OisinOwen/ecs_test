import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Arrays extends BaseTest {
    PageObjects objects = new PageObjects();

    public int[] getArray(int n) {
        int[] row = new int[9];
        WebElement table = driver.findElement(objects.arrayTableBody);
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 0; i < row.length; i++) {
            row[i] = Integer.parseInt(rows.get(n).findElement(By.cssSelector("td:nth-child(" + (i + 1) + ")")).getText());
        }
        return row;
    }

    public Integer getCentre(int[] array) {
        Integer centre = null;
        Integer leftSum = 0;
        Integer rightSum = 0;
        int leftPointer = 0;
        int rightPointer = 8;
        List<Integer> leftSums = new ArrayList<Integer>();
        List<Integer> rightSums = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            leftSum = leftSum + array[leftPointer];
            leftSums.add(leftSum);

            rightSum = rightSum + array[rightPointer];
            rightSums.add(rightSum);
            leftPointer++;
            rightPointer--;
        }

        for (int i = 0; i < rightSums.size(); i++) {
            if (leftSums.contains(rightSums.get(i))) {
                centre = leftSums.indexOf(rightSums.get(i));
            }
        }
        return centre;
    }
}
