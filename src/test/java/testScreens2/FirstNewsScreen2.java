package testScreens2;

import bs.Base118;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstNewsScreen2 {

    @AndroidFindBy(id="coachView")
    @iOSXCUITFindBy(id="test")
    public MobileElement smartView;

    @AndroidFindBy(xpath="(//android.view.View)[4]")
    @iOSXCUITFindBy(id="test")
    public MobileElement newsAgencyName;

    @AndroidFindBy(accessibility ="Navigate up")
    @iOSXCUITFindBy(id="test")
    public MobileElement backButton;

    @AndroidFindBy(xpath="//android.view.View[@content-desc='#no-js-nav']/android.widget.Image")
    @iOSXCUITFindBy(id="test")
    public MobileElement bottomOfScreen;

    @AndroidFindBy(xpath="//*[@text='COMMENTS']")
    @iOSXCUITFindBy(id="test")
    public MobileElement comments;

    @AndroidFindBy(xpath="//*[@text='ARTICLE']")
    @iOSXCUITFindBy(id="test")
    public MobileElement article;

    Base118 bs118;

    public FirstNewsScreen2()
    {
        bs118 = new Base118();
        PageFactory.initElements(new AppiumFieldDecorator(bs118.getDriver()), this);
    }

    public void optimizeView()
    {
        bs118.click(smartView);
    }

    public void getAgencyName()
    {
        System.out.println(newsAgencyName.getText());
    }

    public void moveToCommentsScreen()
    {
        bs118.click(comments);
        bs118.click(article);
    }

}
