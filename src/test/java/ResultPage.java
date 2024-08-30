import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    private WebDriver driver;
    private By paginationLocator=By.xpath("//a[.='2']");

    private By productNameLocator=By.xpath("//div[@id='product-table']/div[3]//div[@class='name']/a");

    public ResultPage(WebDriver driver){
        this.driver=driver;
    }

    public void paginationClick(){
        driver.findElement(paginationLocator).click();
    }


    public void clickToThirdProduct(){
        driver.findElement(productNameLocator).click();
    }
}
