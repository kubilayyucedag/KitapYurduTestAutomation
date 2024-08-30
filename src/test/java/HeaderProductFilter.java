import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HeaderProductFilter {

    private WebDriver driver;

    private By selectBoxFilterLocator = By.xpath("//div[@class='sort']/select[1]");

    private By checkBoxFilterLocator = By.xpath("//label[2]/span[@class='custom-checkmark']");


    public HeaderProductFilter(WebDriver driver){
        this.driver=driver;
    }

    public void selectAlphabeticOption() {
        WebElement selectBox = driver.findElement(selectBoxFilterLocator);
        Select select = new Select(selectBox);
        select.selectByVisibleText("Alfabetik");
    }

    public void checkBoxFilter(){
    driver.findElement(checkBoxFilterLocator).click();
    }


}
