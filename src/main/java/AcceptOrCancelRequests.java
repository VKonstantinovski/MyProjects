import org.openqa.selenium.Keys;

public class AcceptOrCancelRequests extends SeleniumSetup {


    public static String acceptTransportRequest() {


        clickOn("/html/body/div[1]/nav/div[1]/a/img");


        clickOn("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[1]/a[1]/span[2]");


        selectText("//*[@id=\"field_y\"]", "Автомобил");


        clickOn("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[2]/div[1]/div/div[2]/country-selector/div/div[1]/span");


        typeIn("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[2]/div[1]/div/div[2]/country-selector/div/input[1]", "States" + Keys.ENTER);


        clickOn("/html/body/div[3]/div[1]/div[2]/request-search-list/div[1]/div[2]/request-search/div/div/div[3]/a/span[2]");


        clickOn("/html/body/div[3]/div[1]/div[2]/request-search-list/div[2]/request-list/div[2]/div[2]/table/tbody/tr[1]/td[1]/a");


        clickOn("/html/body/div[3]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/button");


        typeIn("/html/body/div[3]/div[1]/div[2]/form/div/div[2]/div[2]/table/tbody/tr/td[5]/input", "1");


        typeIn("/html/body/div[3]/div[1]/div[2]/form/div/div[4]/div/div[1]/div[1]/input", "20.03.2021 00:00");
        waitFor(1);
        typeIn("/html/body/div[3]/div[1]/div[2]/form/div/div[4]/div/div[1]/div[2]/input", "04.04.2021 00:00");


        typeIn("/html/body/div[3]/div[1]/div[2]/form/div/div[4]/div/div[1]/div[3]/input", "04.05.2021 00:00");




        clickOn("/html/body/div[3]/div[1]/div[2]/form/div/div[5]/button");


        waitFor(2);


        clickOn("/html/body/div[1]/div/div/div[3]/button[1]");


        return getText("/html/body/div[3]/div[1]/div[2]/div[1]/div[6]/div[1]/div/h2");


    }

    public static String cancelLookingForTransportRequest() {  //nemozev da go najdam vistinskiot path poso e vrzan so requestot zatoa iam samo cancel ama logikata za confirm ja imam ostaveno

        clickOn("/html/body/div[3]/div[1]/div[1]/ul/li[4]/a/span[2]");


        clickOn("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/request-list/div[2]/div[2]/table/tbody/tr[1]/td[1]/a");

        //WebElement showMoreBtn = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[6]/div[2]/div/div/div[2]/div/div[8]/a"));
        //showMoreBtn.click();

        waitFor(2);


        clickOn("/html/body/div[3]/div[1]/div[2]/div[2]/button");   //cancelOfferBtn


        //WebElement canceledOffersBtn = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/ul/li[3]/a"));
        //canceledOffersBtn.click();
        waitFor(2);

        //WebElement confirmCheckBox = driver.findElement(By.xpath("//*[@id=\"offer0\"]"));
        //confirmCheckBox.click();

        // WebElement confirmBtn = driver.findElement(By.xpath("//*[@id=\"offersSet1549\"]/div/div[1]/div[2]/div[6]/input"));
        //confirmBtn.click();


        return getUrl();



    }
}
