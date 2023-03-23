package classPractice25;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/

   void openBrowser();
   void closeBrowser();
   void maximizeWindow();
   void findElement();
}
class ChromeDriver implements WebDriver{
   @Override
   public void openBrowser() {
      System.out.println("open Browser in Chrome");
   }

   @Override
   public void closeBrowser() {
      System.out.println("Close Browser in chrome ");

   }

   @Override
   public void maximizeWindow() {
      System.out.println("Maximize the window in chrome");
   }

   @Override
   public void findElement() {
      System.out.println("Find elements in Chrome");
   }





}
class FirefoxDriver implements WebDriver{
   public void openBrowser(){
      System.out.println("Open Browser in FireFox Driver");
   }
   public void closeBrowser(){
      System.out.println("Close the browser in Firefox");
   }
   public void maximizeWindow(){
      System.out.println("Maximize Windows in FireFox");
   }
   public void findElement(){
      System.out.println("Find elements in Firfox");
   }
}
class WebDriverTester{
   public static void main(String[] args) {
    WebDriver [] webDrivers={
            new ChromeDriver(),new FirefoxDriver()
    };
      for (WebDriver wb:webDrivers
           ) {wb.openBrowser();
         wb.closeBrowser();
         wb.maximizeWindow();
         wb.findElement();

      }
   }
   }