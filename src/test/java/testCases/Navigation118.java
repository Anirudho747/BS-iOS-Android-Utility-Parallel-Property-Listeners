package testCases;

import bs.Base118;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testScreens2.FirstNewsScreen2;
import testScreens2.HomeScreen2;

import java.io.IOException;

public class Navigation118{

    Base118 bs118;
    HomeScreen2 hs2;
    FirstNewsScreen2 fns2;

    @BeforeClass
    public void beforeSuite()
    {

    }

    @AfterClass
    public void afterSuite()
    {
        bs118.quitDriver();
    }

    @BeforeMethod
    public void beforeMethod()
    {
        bs118 = new Base118();
        bs118.initializeDriver();
        hs2 = new HomeScreen2();
        fns2 = new FirstNewsScreen2();
    }



    @Test
    public void testAll() throws IOException {

        hs2.reachHomeScreen();
//        hs2.navigateToPopularNews();
//        hs2.backToLatestNews();
//        hs2.moveToFirstNews();
//        //  fns.optimizeView();
//        fns2.getAgencyName();
//        fns2.moveToCommentsScreen();
//   //     fns2.moveToBottomOfScreen(driver);

    }
}
