package Pages;

public class Page {
    private int pageId = 54;
    private String pageName;
    private String URL;

    public Page(String pageName, int pageId, String URL){
    }

//    public Page(){
//        this.pageName = pageName;
//        this.pageId = pageId;
//        this.URL = URL;
//    }

    public String getPageName() {
        return pageName;
    }
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getURL() {
        return URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }



    public int getPageId(){
        return pageId;
    }

//    public void setPageId(int pageId){
//        this.pageId = pageId;
//    }


    public void openPage(){
        System.out.println(String.format("Page %s was opened", pageName));
    }

    public void closePage(){
        System.out.println(String.format("Page %s was closed", pageName));
    }

    public void clickButton(String buttonName){
        System.out.println(String.format("Button %s was clicked", buttonName));
    }

//    public abstract void getDeveloperName();

}
