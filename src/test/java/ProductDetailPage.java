import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {

    private WebDriver driver;

    private By addToBasketLocator = By.id("button-cart");

    private By priceInfoLocator =By.xpath("//span[.='Sepete Ekle']");

    public ProductDetailPage(WebDriver driver){
        this.driver=driver;
    }

    public void addToBasket(){
        driver.findElement(addToBasketLocator).click();
    }

   //TODO:ÜRÜN FİYAT ALMA DA BURAYA EKLENEBİLİR


}
