public class LogInLogOut extends SeleniumSetup {

    public static String logMeIn() {

        toUrl("http://138.201.81.153:9095/");

        clickOn("//*[@id=\"login\"]");

        typeIn("//*[@id=\"username\"]", "Vk" + email + "@gluposti.com");

        typeIn("//*[@id=\"password\"]", password + "");

        clickOn("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");

        waitFor(3);

        return getUrl();

    }

    public static String logMeOutIn() {
        toUrl("http://138.201.81.153:9095/");

        clickOn("//*[@id=\"logout2\"]");


        clickOn("//*[@id=\"login\"]");

        typeIn("//*[@id=\"username\"]", "Vk" + email + "@gluposti.com");

        typeIn("//*[@id=\"password\"]", password + "");

        clickOn("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");

        waitFor(3);

        return getUrl();


    }

    public static String logMeInTransporter() {
        toUrl("http://138.201.81.153:9095/");



        clickOn("//*[@id=\"login\"]");


        typeIn("//*[@id=\"username\"]", "Vk1" + email + "@gluposti.com");


        typeIn("//*[@id=\"password\"]", password + "");


        clickOn("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");

        waitFor(3);
        return getUrl();


    }
}
