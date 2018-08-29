package ShopObjects.pageObjects;

public class SamplePage {

    public static String commentTextBox(){
        return "//*[@id = 'comment']";
    }
    public static String nameTextBox(){
        return "//*[@id = 'author']";
    }
    public static String emailTextBox(){
        return "//*[@id='email']";
    }
    public static String postCommentButton(){
        return "//*[@id='submit']";

    }
    public static String errorMessageText(){
        return "//*[contains(text(), 'valid')]";
    }
    public static String backButton(){
        return "//a[contains(text(), 'Back')]";
    }
}
