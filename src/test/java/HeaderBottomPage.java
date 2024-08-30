import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HeaderBottomPage {

    private WebDriver driver;
    private By searchInputLocator = By.id("search-input");
    private By basketNumberLocator = By.id("cart-items");

    private By basketToLocator= By.id("js-cart");


    public HeaderBottomPage(WebDriver driver){
        this.driver=driver;
    }
    public void search(String searchWord){
    driver.findElement(searchInputLocator).sendKeys(searchWord+ Keys.ENTER);

    }

    public void goToBasket() {
        driver.findElement(basketNumberLocator).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(basketToLocator));

        driver.findElement(basketToLocator).click();
    }

    public String getBasketTotalNumber(){

        return driver.findElement(basketNumberLocator).getText();
    }


}
