import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateUsers extends SeleniumSetup {




    public static  String createUserLookingForTransporter() {

        toUrl("http://138.201.81.153:9095/");

        clickOn("/html/body/div[1]/nav/div[3]/ul/li[3]/a/span");

        waitFor(2);

        clickOn("/html/body/div[3]/div[1]/div/div/div[1]/button");

        selectText("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[1]/div[2]/select", "Физичко лице");

        typeIn("//*[@id=\"firstName\"]", "Name");

        typeIn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[4]/div[2]/input", "Last Name ");

        typeIn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[6]/div[1]/div[2]/input", "address");

        typeIn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[6]/div[3]/div[2]/input", "Ohrid");

        typeIn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[6]/div[5]/div[2]/input", "222333");

        clickOn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[6]/div[7]/div[2]/country-selector/div/div[1]/span");

        typeIn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[6]/div[7]/div[2]/country-selector/div/input[1]", "Macedonia" + Keys.ENTER);

        typeIn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[6]/div[9]/div[2]/input", "555333");

        typeIn("//*[@id=\"email\"]", "Vk" + email + "@gluposti.com");

        typeIn("//*[@id=\"password\"]", password + "");

        typeIn("//*[@id=\"confirmPassword\"]", password + "");

        clickOn("//*[@id=\"acceptTerms\"]");

        clickOn("/html/body/div[3]/div[1]/div/div/div/div[2]/form/div[15]/input");

        waitFor(5);

        return getUrl();


    }

    public static String createUserIAmATransporter() {



        waitFor(2);

        clickOn("/html/body/div[1]/nav/div[3]/ul/li[3]/a/span");
        waitFor(1);
        clickOn("/html/body/div[1]/nav/div[3]/ul/li[3]/a/span");

        waitFor(2);


        clickOn("/html/body/div[3]/div[1]/div/div/div[2]/button");




        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[1]/div[2]/input","Name");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[3]/div[2]/input","Last Name ");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[5]/div[2]/input","Company");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[7]/div[2]/input","Address");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[9]/div[2]/input","Ohrid");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[11]/div[2]/input","222333");


        clickOn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[13]/div[2]/country-selector/div/div[1]/span");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[13]/div[2]/country-selector/div/input[1]","Macedonia"+Keys.ENTER);


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[15]/div[2]/input","213123123");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[1]/div[16]/div[2]/input","555333");


        typeIn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[2]/div[2]/input","Vk1" + email + "@gluposti.com");


        typeIn("//*[@id=\"password\"]",password + "");


        typeIn("//*[@id=\"confirmPassword\"]",password + "");


        clickOn("//*[@id=\"acceptTerms\"]");


        clickOn("/html/body/div[3]/div[1]/div/div/div[2]/form/div[10]/input");


        waitFor(5);

        return getUrl();



    }


}
