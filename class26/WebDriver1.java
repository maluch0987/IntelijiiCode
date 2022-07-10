package com.syntax.class26;

public interface WebDriver1 {
    /*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
   void  openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver1 {

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
class FirefoxDriver implements WebDriver1 {

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
    class DriverTest{
        public static void main(String[] args) {
            WebDriver1[]webDriver1={new FirefoxDriver(),new ChromeDriver()};
            for (WebDriver1 webDriver11:webDriver1){
                webDriver11.closeBrowser();
                webDriver11.findElement();
           webDriver11.openBrowser();
                webDriver11.maximizeWindow();

            }
        }
    }
}
