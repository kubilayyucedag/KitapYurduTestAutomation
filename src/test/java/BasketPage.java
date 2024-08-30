import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasketPage {

    private WebDriver driver;

    private By productQuantity= By.name("quantity");
    private By updateProductQuantity= By.className("fa-refresh");

    private By nullBasket= By.className("red-icon");

    private By cartEmptyMessage = By.id("cart-items-empty");

    public BasketPage(WebDriver driver){
        this.driver=driver;
    }

    public void  updateProductQuantity(String newQuantity) {
        driver.findElement(productQuantity).clear();
        driver.findElement(productQuantity).sendKeys(newQuantity);
        driver.findElement(updateProductQuantity).click();
    }

    public void nullToBasket(){
        driver.findElement(nullBasket).click();
    }

    public boolean isCartEmptyMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement emptyCartMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartEmptyMessage));
            return emptyCartMessageElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


}
