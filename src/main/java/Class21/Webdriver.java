package Class21;

public abstract class Webdriver {
    abstract void openBrowser();
    abstract void loadURL(String URL);
    abstract void  performTesting();
    abstract void  close();
}
class chromeDriver extends Webdriver{
    @Override
    void openBrowser() {
        System.out.println("Opening the Google Chrome Browser");
    }
    @Override
    void loadURL(String URL) {
        System.out.println("loading the URL "+URL);
    }
    @Override
    void performTesting() {
        System.out.println("Performing testing");
    }
    @Override
    void close() {
        System.out.println("Closing a browser");
    }
}
class Firefox extends Webdriver{
    @Override
    void openBrowser() {
        System.out.println();
    }
    @Override
    void loadURL(String URL) {

    }
    @Override
    void performTesting() {

    }
    @Override
    void close() {

    }
}
