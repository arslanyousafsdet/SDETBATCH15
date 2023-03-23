package class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("opening a URL");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");

    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening URL in google chrome ");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google chrome" );
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening URL in google Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Safari" );
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Browser in FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening URL in FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google FireFox" );
    }
}