package OOPJava;

public class WebTester {
    public static void main(String[] args) {
        WebDriver[] webDriver = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (WebDriver webDriver1 : webDriver) {
            webDriver1.click();
            webDriver1.get("https://www.google.com");
            webDriver1.sendKeys("search query");

            System.out.println("Page is title " + webDriver1);
        }
    }
}

