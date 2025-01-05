package Pages;

public class AboutPage extends Page implements PageInterface{




    String disclaimer;

    public AboutPage(String pageName, int pageId, String URL) {
        super(pageName, pageId, URL);
    }

    public String getDisclaimer() {
        return disclaimer;
    }
    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }
    public void getDeveloperName(){
        System.out.println("Mary Johns");
    }

}
