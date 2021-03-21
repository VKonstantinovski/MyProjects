public class InvalidRequests extends SeleniumSetup {

    public static String emptyRun() {

        clickOn("//*[@id=\"logout2\"]");

        clickOn("//*[@id=\"login\"]");

        clickOn("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");

        waitFor(2);

        return getText("/html/body/div[1]/div/div/div[2]/div/div[1]/div");

    }
}
