package Project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver extends WebDriver{
    void navigate();

    @Override
    void open();

    @Override
    void close();

    @Override
    String getTitle();
}
interface TakeScreenShot extends WebDriver{
    void getScreenShot();
}


class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate the google Chrome Driver");

    }

    @Override
    public void open() {
        System.out.println("Open the ChromeDriver");

    }

    @Override
    public void close() {
        System.out.println("Close the ChromeDriver");

    }

    @Override
    public String getTitle() {
        return "Return the title to the ChromeDriver";
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Navigate to the FirefoxDriver");

    }

    @Override
    public void open() {
        System.out.println("Open the FireFox Browser");

    }

    @Override
    public void close() {
        System.out.println("Close the FireFox Browser");

    }

    @Override
    public String getTitle() {
        return "Return the FireFoxtitle";
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Navigate to the SafariDriver");

    }

    @Override
    public void open() {
        System.out.println("Open the SafariBrowser");

    }

    @Override
    public void close() {
        System.out.println("Close the SafariBrowser");

    }

    @Override
    public String getTitle() {
        return "Return the safari Browser";
    }
}
