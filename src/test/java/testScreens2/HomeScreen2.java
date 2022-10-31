package testScreens2;

import bs.Base118;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;


public class HomeScreen2 {

    @AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'editText')]")
    @iOSXCUITFindBy(xpath="//*[contains(@name,'email_text_field')]")
    public MobileElement USER_NAME_FIELD;

    @AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'editText2')]")
    @iOSXCUITFindBy(xpath="//*[contains(@name,'password_text_field')]")
    public MobileElement PASSWORD_FIELD;

    @AndroidFindBy(id ="txtSignIn")
    @iOSXCUITFindBy(xpath="//*[@name='SIGN IN']")
    public MobileElement LOGIN_BTN;

//    @AndroidFindBy(xpath="(//*[@text='Popular Today'])[1]")
//    @iOSXCUITFindBy(id="test")
//    public AndroidElement popularToday;
//
//    @AndroidFindBy(xpath="(//*[@content-desc=\"Article Title\"])[1]")
//    @iOSXCUITFindBy(id="test")
//    public AndroidElement firstArticle;

    Base118 bs118;

    public HomeScreen2 ()
    {
        bs118 = new Base118();
        PageFactory.initElements(new AppiumFieldDecorator(bs118.getDriver()), this);
    }

    public void reachHomeScreen()
    {
//        okButton.click();
//        okButton2.click();
        bs118.sendKeys(USER_NAME_FIELD,"Testuser");
        bs118.sendKeys(PASSWORD_FIELD,"testpassword");
        bs118.click(LOGIN_BTN);
    }

//    public void navigateToPopularNews()
//    {
////        navigationDrawer.click();
////        popularToday.click();
//        bs118.click(navigationDrawer);
//        bs118.click(popularToday);
//    }
//
//    public void backToLatestNews()
//    {
////        navigationDrawer.click();
////        firstArticle.click();
//        bs118.click(navigationDrawer);
//        bs118.click(firstArticle);
//    }
//
//    public void moveToFirstNews()
//    {
//     //   firstArticle.click();
//        bs118.click(firstArticle);
//    }
}
