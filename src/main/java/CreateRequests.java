import org.openqa.selenium.Keys;

public class CreateRequests extends SeleniumSetup {

    public static String createTransportRequest() {


        clickOn("/html/body/div[3]/div[1]/div[1]/ul/li[3]/a/span[2]");

        typeIn("//*[@id=\"newRequestForm\"]/div/div[2]/div[2]/input","1" + password);

        selectText("//*[@id=\"field_y\"]","Автомобил");


        typeIn("//*[@id=\"newRequestForm\"]/div/div[4]/div[2]/place-search-field/input","Macedonia");
        waitFor(1);
        typeIn("//*[@id=\"newRequestForm\"]/div/div[4]/div[2]/place-search-field/input","" + Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ENTER);



        typeIn("//*[@id=\"newRequestForm\"]/div/div[5]/div[2]/place-search-field/input","Macedonia");
        waitFor(1);
        typeIn("//*[@id=\"newRequestForm\"]/div/div[5]/div[2]/place-search-field/input",""+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ENTER);



        typeIn("//*[@id=\"newRequestForm\"]/div/div[10]/div[2]/div[2]/div[2]/input","Koliste");

        typeIn("//*[@id=\"newRequestForm\"]/div/div[10]/div[2]/div[3]/div[2]/input","prejako");

        typeIn("//*[@id=\"newRequestForm\"]/div/div[10]/div[2]/div[4]/div[2]/input","2047");

        clickOn("//*[@id=\"cacheDelivery\"]");


        clickOn("//*[@id=\"newRequestForm\"]/div/div[14]/input");

        waitFor(2);

        return getText("/html/body/div[3]/div[1]/div[2]/div/request-list-pagination/request-list/div[2]/div[2]/table/tbody/tr[1]/td[1]/a");
    }

    public static String customerSupport() {

        clickOn("/html/body/div[3]/div[1]/div[1]/ul/li[6]/a/span[2]");

        typeIn("/html/body/div[3]/div[1]/div[2]/div/div/div/div[3]/div[1]/input","Ku je mori ");

        typeIn("/html/body/div[3]/div[1]/div[2]/div/div/div/div[3]/div[2]/textarea","oj mor ti ");

        waitFor(3);

        clickOn("/html/body/div[3]/div[1]/div[2]/div/div/div/div[3]/button");

        waitFor(3);

        return getText("/html/body/div[3]/div[1]/div[2]/div/div/div/div[1]/strong");



    }
}
