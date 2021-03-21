import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeClass
    public void start() {
        SeleniumSetup.test();

    }

    @Test(priority = 5)
    public void homePageNavigation() {

        Assert.assertEquals(VerifyHomePage.verifyHomePage(), "http://138.201.81.153:9095/");

    }

    @Test(priority = 10)
    public void createUserLookingForTransporter() {

        Assert.assertEquals(CreateUsers.createUserLookingForTransporter(), "http://138.201.81.153:9095/account-type/register-client/client-successful-registration");
    }

    @Test(priority = 20)
    public void LogInLookingForTransporter() {
        Assert.assertEquals(LogInLogOut.logMeIn(), "http://138.201.81.153:9095/client/home");


    }

    @Test(enabled = false)
    public void CustomerSupport() {
        Assert.assertEquals(CreateRequests.customerSupport(), "Вашиот меил е успешно испратен до одделот за корисничка поддршка!");
    }


    @Test(priority = 30)
    public void createTransportRequest() {
        Assert.assertEquals(CreateRequests.createTransportRequest(), ("1" + SeleniumSetup.password));


    }

    @Test(priority = 40)
    public void CreateUserIAmTransporter() {

        Assert.assertEquals(CreateUsers.createUserIAmATransporter(), "http://138.201.81.153:9095/account-type/register-provider/provider-successful-registration");
    }

    @Test(priority = 50)
    public void logMeInTransporter() {
        Assert.assertEquals(LogInLogOut.logMeInTransporter(), "http://138.201.81.153:9095/provider/home");
    }

    @Test(priority = 60)
    public void AcceptTransportRequest() {

        Assert.assertEquals(AcceptOrCancelRequests.acceptTransportRequest(), "Понуди за барањето");
    }

    @Test(priority = 70)
    public void logMeOutIn() {

        Assert.assertEquals(LogInLogOut.logMeOutIn(), "http://138.201.81.153:9095/client/home");

    }

    @Test(priority = 80)
    public void cancelLookingForTransportRequest() {
        Assert.assertEquals(AcceptOrCancelRequests.cancelLookingForTransportRequest(), "http://138.201.81.153:9095/client/my-requests/cancelled");


    }

    @Test(priority = 90)
    public void customerSupport() {

        Assert.assertEquals(CreateRequests.customerSupport(), "Вашиот меил е успешно испратен до одделот за корисничка поддршка!");
    }

    @Test(priority = 100)
    public void emptyLogInForm() {

        Assert.assertEquals(InvalidRequests.emptyRun(), "Вашиот обид е неуспешен! Ве молиме проверете го вашето корисничко име и лозинка и обидете се повторно.");
    }

    @AfterClass
    public void end() {
        SeleniumSetup.end();
    }


}
