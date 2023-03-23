package Project2;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] wb={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for (WebDriver webDriver:wb
             ) {
            webDriver.close();
            webDriver.open();
            webDriver.getTitle();



        }
        RemoteWebDriver [] remoteWebDrivers={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for (RemoteWebDriver rd:remoteWebDrivers
             ) {
            rd.close();
            rd.navigate();
            rd.getTitle();
            rd.open();


        }

    }
}
