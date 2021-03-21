public class VerifyHomePage extends SeleniumSetup {

    public static String verifyHomePage() {
        toUrl("http://138.201.81.153:9095/");

        return driver.getCurrentUrl();
    }
}
