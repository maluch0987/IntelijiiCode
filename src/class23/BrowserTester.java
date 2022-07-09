package class23;

public class BrowserTester {
    public static void main(String[] args) {
        WebDriver[] browsers = {new Chrome(), new Safari(), new Edge(), new FireFox()};
        for (WebDriver driver : browsers) {
            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }
    }
}
