import org.testng.annotations.Test;
import org.testng.Assert;

public class KitapYurduTest extends BaseTest {

    HeaderBottomPage headerBottomPage;

    HeaderProductFilter headerProductFilter;

    ResultPage resultPage;

    ProductDetailPage productDetailPage;

    BasketPage basketPage;

    @Test(priority = 1)
    public void searchTest(){
        driver.get("https://www.kitapyurdu.com/");

        headerBottomPage =new HeaderBottomPage(driver);
        headerBottomPage.search("Sabahattin Ali");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Test (priority = 2)
    public void selectBoxTest(){
        headerProductFilter = new HeaderProductFilter(driver);
        headerProductFilter.selectAlphabeticOption();



    }
    @Test (priority = 3)
    public void checkBoxTest(){
        headerProductFilter = new HeaderProductFilter(driver);
        headerProductFilter.checkBoxFilter();


    }

    @Test(priority = 4)
    public void resultPagination(){
        resultPage=new ResultPage(driver);
        resultPage.paginationClick();

    }
    @Test (priority = 5)
    public void resultProductName(){
        resultPage=new ResultPage(driver);
        resultPage.clickToThirdProduct();

    }
    @Test(priority = 6)
    public void productDetailBasket(){
        productDetailPage=new ProductDetailPage(driver);
        productDetailPage.addToBasket();

    }

   @Test(priority = 7)
   public void logBasket(){
        headerBottomPage=new HeaderBottomPage(driver);
        headerBottomPage.goToBasket();

   }
   @Test(priority = 8)
    public void updateBasket(){
        basketPage=new BasketPage(driver);
        basketPage.updateProductQuantity("2");

   }
   @Test(priority = 9)
    public void deleteBasket(){
        basketPage=new BasketPage(driver);
        basketPage.nullToBasket();

       boolean isMessageDisplayed = basketPage.isCartEmptyMessageDisplayed();
       Assert.assertTrue(isMessageDisplayed, "Test başarısız: 'Sepetiniz boş' mesajı bulunamadı.");

   }


}
